/*******************************************************************************
 * Copyright (c) 2008, 2013
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (javier.canovas@inria.fr) 
 *******************************************************************************/



package fr.inria.atlanmod.decision.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration;
import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationFactory;
import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationPackage;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Decision;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions;
import fr.inria.atlanmod.decision.collaboration.Collaboration.User;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Vote;
import fr.inria.atlanmod.governance.strategy.CollaborationType;
import fr.inria.atlanmod.governance.strategy.Deadline;
import fr.inria.atlanmod.governance.strategy.LeaderDriven;
import fr.inria.atlanmod.governance.strategy.Majority;
import fr.inria.atlanmod.governance.strategy.OCLCondition;
import fr.inria.atlanmod.governance.strategy.PhasedStrategy;
import fr.inria.atlanmod.governance.strategy.Project;
import fr.inria.atlanmod.governance.strategy.RatioMajority;
import fr.inria.atlanmod.governance.strategy.Role;
import fr.inria.atlanmod.governance.strategy.Strategy;
import fr.inria.atlanmod.governance.strategy.Timer;
import fr.inria.atlanmod.governance.strategy.WaitForVote;

public class DecisionEngine {
	public static DecisionEngine INSTANCE = new DecisionEngine();

	private String user = "";
	private HashMap<String, ProxyTask> tasks;
	private Project strategies;
	private Interactions collaborations;

	private File strategyFile;
	private File collaborationFile;

	public void login(String userToLogin) {
		user = userToLogin;
	}

	public String getUser() {
		return user;
	}

	public Object[] getTasksFromRepository() {
		List<ProxyTask> proxyTasks = MylynMediator.INSTANCE.getProxyTasks();
		tasks = new HashMap<String, ProxyTask>();
		for(ProxyTask task : proxyTasks) {
			Collaboration collaboration = CollaborationFactory.eINSTANCE.createCollaboration();
			if(collaborations != null)
				collaborations.getCollaborations().add(collaboration);
			task.initCollaborationProxy(collaboration);
			
			String id = task.getTaskId();
			tasks.put(id, task);
		}
		return proxyTasks.toArray();
	}


	public Object[] getTasks() {
		if(tasks == null || tasks.values().size() == 0) getTasksFromRepository();
		return tasks.values().toArray();
	}

	public void applyDecision() {
		for(ProxyTask task : tasks.values()) {
			Strategy strategy = findStrategyforTask(task);
			Decision decision = applyStrategy(strategy, task);
			task.setAccepted(decision.isAccepted());
			if(collaborations != null) 
				collaborations.getDecisions().add(decision);
		}
		if(collaborations != null)
			saveCollaboration();
	}

	private Strategy findStrategyforTask(ProxyTask task) {
		if(strategies != null) 
			for(Strategy strategy : strategies.getStrategies()) {
				// TODO Consider other values for CollaborationType
				if(strategy.getAppliedTo().equals(CollaborationType.TASK)) {
					if(isIncludedInFilter(strategy, task)) {
						return strategy;
					}
				}
			}
		return null;
	}

	private Decision applyStrategy(Strategy strategy, ProxyTask task) {
		Decision result = CollaborationFactory.eINSTANCE.createDecision();
		result.setStrategy(strategy);
		result.setDecides(task.getCollaboration());
		result.setAccepted(false);

		if (strategy instanceof Majority || strategy instanceof RatioMajority) {
			Majority majority = (Majority) strategy;

			if(deadlineMet(strategy, task)) {
				int[] votes = getVotes(strategy, task);
				int positiveVotes = votes[0];
				int negativeVotes = votes[1];

				int numVotes = negativeVotes + positiveVotes;
				if(numVotes < majority.getMinVotes()) {
					result.setAccepted(false);
					return result;
				}

				if(negativeVotes + positiveVotes == 0) {
					result.setAccepted(false);
					return result;
				}
				else {
					float ratio = (positiveVotes) / (negativeVotes + positiveVotes);

					float strategyRatio = 0.5f;
					if (majority instanceof RatioMajority) {
						RatioMajority ratioMajority = (RatioMajority) majority;
						strategyRatio = ratioMajority.getRatio();	 				
					}

					if(ratio >= strategyRatio) result.setAccepted(true);
					else result.setAccepted(false);
					return result;
				}
			}
		} else if (strategy instanceof LeaderDriven) {
			LeaderDriven leaderDriven = (LeaderDriven) strategy;
			
			if(deadlineMet(strategy, task)) {
				User leader = task.getCollaboration().getLeader();
				List<Vote> votes = task.getCollaboration().getVotes();
				for(Vote vote : votes) {
					if(vote.getVotedBy().getName().equals(leader.getName())) {
						result.setAccepted(vote.isAgreement());
						return result;
					}
				}
				
				return applyStrategy(leaderDriven.getDefault(), task);
			}
			
		} else if (strategy instanceof PhasedStrategy) { 
			PhasedStrategy phasedStrategy = (PhasedStrategy) strategy;
			for(Strategy subStrategy : phasedStrategy.getPhases()) {
				boolean hasBeenDecided = false;
				for(Decision decision : collaborations.getDecisions()) {
					if(decision.getStrategy() == subStrategy) hasBeenDecided = true;
				}
				if(!hasBeenDecided) {
					return applyStrategy(subStrategy, task);
				}
			}
		}
		
		return result;
	}

	private int[] getVotes(Strategy strategy, ProxyTask task) {
		List<Vote> votes = calculateAllowedVotes(strategy, task);
		
		int positiveResult = 0;
		int negativeResult = 0;
		for(Vote vote : votes) {
			if(vote.isAgreement()) positiveResult++;
			else negativeResult++;
		}
		
		int[] result = new int[] { positiveResult, negativeResult };
		return result;
	}

	private List<Vote> calculateAllowedVotes(Strategy strategy, ProxyTask task) {
		List<Vote> votes = task.getCollaboration().getVotes();
		List<Role> allowedRoles = strategy.getPeople();
		
		List<Vote> allowedVotes = new ArrayList<Vote>();
		for(Vote vote : votes) {
			User user = vote.getVotedBy();
			List<Role> userRoles = user.getRoles();
			if(userRoles == null || userRoles.size() == 0) {
				// By default, if a user is not included in any role, he/she cannot vote!
			} else {
				boolean found = false;
				for(Role userRole : userRoles) {
					for(Role allowedRole : allowedRoles) {
						if(userRole.getName().equals(allowedRole.getName())) {
							allowedVotes.add(vote);
							found = true;
							break;
						}
					}
					if(found) break;
				}
			}
		}
		return allowedVotes;
	}
	
	private boolean deadlineMet(Strategy strategy, ProxyTask task) {
		Deadline deadline = strategy.getDeadline();
		if (deadline instanceof Timer) {
			Timer timer = (Timer) deadline;
			Date creationDate = task.getCreationDate();
			Days days = Days.daysBetween(LocalDate.fromDateFields(creationDate), LocalDate.fromDateFields(new Date()));
			
			int deadlineDays = timer.getTimeStamp();
			if(days.getDays() < deadlineDays) return false;
			else return true;
		} else if (deadline instanceof WaitForVote) {
			WaitForVote waitForVote = (WaitForVote) deadline;
			List<Role> rolesToWaitFor = waitForVote.getRoles();
			
			List<User> allUsers = collaborations.getUsers();
			List<User> usersToVote = new ArrayList<User>();
			for(User user : allUsers) {
				for(Role role : user.getRoles()) {
					boolean found = false;
					for(Role roletToWaitFor : rolesToWaitFor) {
						if(role.getName().equals(roletToWaitFor.getName())) {
							usersToVote.add(user);
							found = true;
							break;
						}
					}
					if(found) break;
				}
			}
			
			List<User> usersVoted= new ArrayList<User>();
			for(Vote vote : task.getCollaboration().getVotes()) {
				usersVoted.add(vote.getVotedBy());
			}
			
			// I'm not very proud of this, but I was having a hard afternoon 
			// and I didn't come up with other solution :(
			int totalUsersToVote = usersToVote.size();
			for(User userVoted: usersVoted) {
				for(User userToVote: usersToVote) {
					if(userVoted.getName().equals(userToVote.getName())) {
						totalUsersToVote--;
					}
				}
			}
			
			if(totalUsersToVote == 0) return true;
			else return false;
		} else if (deadline instanceof OCLCondition) {
			OCLCondition oclCondition = (OCLCondition) deadline;
			// TODO consider OCL expressions
		}
		
		return true;
	}

	private boolean isIncludedInFilter(Strategy strategy, ProxyTask task) {
		// TODO Dealing with filters
		return true;
	}

	public void resetTasks() {
		for(ProxyTask task : tasks.values()) {
			task.reset();
		}
	}

	public void loadStrategy(File strategyFile) {
		this.strategyFile = strategyFile;

		ResourceSet rset = new ResourceSetImpl();
		Project result = null;

		Resource res = rset.getResource(URI.createFileURI(strategyFile.getAbsolutePath()), true);
		try {
			res.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		result = (Project) res.getContents().get(0);

		strategies = result;	
	}

	public void loadStrategyAndCollaboration(File strategyFile,	File collaborationFile) {
		this.strategyFile = strategyFile;
		this.collaborationFile = collaborationFile;

		ResourceSet rset = new ResourceSetImpl();
		rset.getPackageRegistry().put(CollaborationPackage.eNS_URI, CollaborationPackage.eINSTANCE);
		rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("collaboration", new EcoreResourceFactoryImpl());

		Project project = null;

		Resource resProject = rset.getResource(URI.createFileURI(strategyFile.getAbsolutePath()), true);
		try {
			resProject.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		project = (Project) resProject.getContents().get(0);
		strategies = project;	

		Interactions interactions = null;
		Resource resColl = rset.getResource(URI.createFileURI(collaborationFile.getAbsolutePath()), true);
		try {
			resColl.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		interactions = (Interactions) resColl.getContents().get(0);
		collaborations = interactions;	

	}


	private void saveCollaboration() {
		if(collaborationFile != null) {
			ResourceSet rset = new ResourceSetImpl();
			rset.getPackageRegistry().put(CollaborationPackage.eNS_URI, CollaborationPackage.eINSTANCE);
			rset.getResourceFactoryRegistry().getExtensionToFactoryMap().put("collaboration", new EcoreResourceFactoryImpl());
			
			rset.getResource(URI.createFileURI(strategyFile.getAbsolutePath()), true);
			Resource resProject = rset.getResource(URI.createFileURI(collaborationFile.getAbsolutePath()), true);
			try {
				resProject.getContents().clear();
				resProject.getContents().add(collaborations);
				resProject.save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
