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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.eclipse.mylyn.tasks.core.ITask;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import fr.inria.atlanmod.decision.collaboration.Collaboration.Collaboration;
import fr.inria.atlanmod.decision.collaboration.Collaboration.CollaborationFactory;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Interactions;
import fr.inria.atlanmod.decision.collaboration.Collaboration.User;
import fr.inria.atlanmod.decision.collaboration.Collaboration.Vote;

public class ProxyTask {
	private static final String ACCEPTED_ATT = "accepted";
	private static final String DECIDED_ATT = "decided";

	ITask task;

	private List<String> positiveVotes;
	private List<String> negativeVotes;

	private boolean accepted;
	private boolean decided;
	
	private Collaboration collaboration;

	public ProxyTask(ITask task) {
		this.task = task;
		positiveVotes = new ArrayList<String>();
		negativeVotes = new ArrayList<String>();
				
		String acceptedAtt = this.task.getAttribute(ACCEPTED_ATT);
		if(acceptedAtt != null) {
			boolean accepted = Boolean.valueOf(acceptedAtt);
			this.accepted = accepted;
			String decidedAtt = this.task.getAttribute(DECIDED_ATT);
			if(decidedAtt != null) 
				this.decided = Boolean.valueOf(decidedAtt);
			else
				this.decided = false;
		} else {
			accepted = false;
			decided = false;
		}
	}
	
	public void initCollaborationProxy(Collaboration collaboration) {
		this.collaboration = collaboration;
		collaboration.setName(getTaskId());

		String owner = getOwner();
		User user = locateUser(owner);
		collaboration.setLeader(user);
	}
	
	
	public void reset() {
		setAccepted(false);
		setDecided(false);
		collaboration.getVotes().clear();
	}

	public String getTaskId() {
		return task.getTaskId(); 
	}
	
	public Date getCreationDate() {
		Date creationDate = task.getCreationDate();
		return creationDate;		
	}

	public String getOwner() {
		String owner = task.getOwner();
		return owner;
	}
		
	public void voteYes(String userName) {
		Vote vote = CollaborationFactory.eINSTANCE.createVote();
		vote.setAgreement(true);
		User user = locateUser(userName);
		vote.setVotedBy(user);
		collaboration.getVotes().add(vote);
		positiveVotes.add(userName);
	}

	public void voteNo(String userName) {
		Vote vote = CollaborationFactory.eINSTANCE.createVote();
		vote.setAgreement(false);
		User user = locateUser(userName);
		vote.setVotedBy(user);
		collaboration.getVotes().add(vote);
		negativeVotes.add(userName);
	}

	public int getTotalNegativeVotes() {
		return negativeVotes.size();
	}

	public int getTotalPositiveVotes() {
		return positiveVotes.size();
	}

	public boolean isAccepted() {
		return accepted;
	}

	public boolean isDecided() {
		return decided;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
		this.task.setAttribute(ACCEPTED_ATT, String.valueOf(accepted));
		setDecided(true);
	}

	private void setDecided(boolean decided) {
		this.decided = decided;
		this.task.setAttribute(DECIDED_ATT, String.valueOf(decided));
	}

	public Collaboration getCollaboration() {
		return collaboration;
	}

	private User locateUser(String name) {
		if(collaboration != null) {
			if (collaboration.eContainer() instanceof Interactions) {
				Interactions interactions = (Interactions) collaboration.eContainer();
				for(User user : interactions.getUsers()) {
					if(user.getName().equals(name)) return user;
				}
			}
			
			User newUser = CollaborationFactory.eINSTANCE.createUser();
			newUser.setName(name);
			if (collaboration.eContainer() instanceof Interactions) {
				Interactions interactions = (Interactions) collaboration.eContainer();
				interactions.getUsers().add(newUser);
			}
			return newUser;
		} else {
			return null;
		}
	}

}
