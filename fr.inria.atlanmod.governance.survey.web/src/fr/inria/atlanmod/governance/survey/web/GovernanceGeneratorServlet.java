package fr.inria.atlanmod.governance.survey.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * This servlet generates the english verbalization of a governance rule. The options are included in the parameters
 * of the POST call.
 *
 * @author Javier Canovas (me@jlcanovas.es)
 */
@WebServlet("/generator")
public class GovernanceGeneratorServlet extends javax.servlet.http.HttpServlet {
	public final static String DEFAULT_LANGUAGE = "en"; 
	
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    	String language = request.getParameter("language");
    	if(language == null) language = DEFAULT_LANGUAGE;
    	
        String collaborationType = request.getParameter("q1");
        String collaborationPhase = request.getParameter("q2");

        // These parameters are boolean but received as string
        boolean leaderParticipation = (request.getParameter("q3A") != null && request.getParameter("q3A").equals("true")) ? true : false;
        boolean projectBoardParticipation = (request.getParameter("q3B") != null && request.getParameter("q3B").equals("true")) ? true : false;
        boolean contributorsParticipation = (request.getParameter("q3C") != null && request.getParameter("q3C").equals("true")) ? true : false;
        boolean usersParticipation = (request.getParameter("q3D") != null && request.getParameter("q3D").equals("true")) ? true : false;
        boolean otherParticipation = (request.getParameter("q3E") != null && request.getParameter("q3E").equals("true")) ? true : false;
        String otherRoleParticipation = "";
        if(otherParticipation) {
        	otherRoleParticipation = request.getParameter("q3F");
        }

        String strategy = request.getParameter("q4");
        String democracyRange = request.getParameter("q4A");
        String democracyRatio = request.getParameter("q4B");
        String democracyMinVotes = request.getParameter("q4C");
        String deadlineDays = request.getParameter("q5A");
        String deadlineHours = request.getParameter("q5B");
        boolean noDeadline = (request.getParameter("q5C") != null && request.getParameter("q5C").equals("true")) ? true : false;

        String result = "";

        if(language.equals("dsl")) {
            result = generateDSL(collaborationType, collaborationPhase,
    				leaderParticipation, projectBoardParticipation,
    				contributorsParticipation, usersParticipation,
    				otherParticipation, otherRoleParticipation, strategy,
    				democracyRange, democracyRatio, democracyMinVotes,
    				deadlineDays, deadlineHours, noDeadline);	
        } else {
            result = generateEnglish(collaborationType, collaborationPhase,
    				leaderParticipation, projectBoardParticipation,
    				contributorsParticipation, usersParticipation,
    				otherParticipation, otherRoleParticipation, strategy,
    				democracyRange, democracyRatio, democracyMinVotes,
    				deadlineDays, deadlineHours, noDeadline);	
        }
        

        PrintWriter out = response.getWriter();
        out.print(result);
    }

	private String generateEnglish(String collaborationType,
			String collaborationPhase, boolean leaderParticipation,
			boolean projectBoardParticipation,
			boolean contributorsParticipation, boolean usersParticipation,
			boolean otherParticipation, String otherRoleParticipation,
			String strategy, String democracyRange, String democracyRatio,
			String democracyMinVotes, String deadlineDays,
			String deadlineHours, boolean noDeadline) {
		String result = "";
		
		if(collaborationType == null || collaborationPhase == null || strategy == null || (!leaderParticipation && !projectBoardParticipation && !contributorsParticipation && !usersParticipation && (!otherParticipation || (otherParticipation && otherRoleParticipation == null))) || (deadlineDays == null && deadlineHours == null && !noDeadline))
            result = "There is an error in the parameters";
        else {
            String prePhaseString = "";
            String postPhaseString = "";

            if(collaborationPhase.equals("CollaborationAcceptance")) {
                prePhaseString = "proposals for";
            } else if (collaborationPhase.equals("PatchAcceptance")) {
                prePhaseString = "patches for";
            } else if (collaborationPhase.equals("ReleaseAcceptance")) {
                postPhaseString = "for the next release ";
            }

            if(collaborationType.equals("Bug")) {
                result = "All " + prePhaseString + " bugs will be accepted or rejected " + postPhaseString;
            } else if(collaborationType.equals("Enhancement")) {
                result = "All " + prePhaseString + " feature requests will be accepted or rejected " + postPhaseString;
            } else if(collaborationType.equals("Comment")) {
                result = "All " + prePhaseString + " comments will be accepted or rejected " + postPhaseString;
            } else if(collaborationType.equals("All")) {
                result = "All " + prePhaseString + " bugs and feature requests will be accepted or rejected " + postPhaseString;
            }

            if(noDeadline) {
                result += "with no deadline ";
            } else if(deadlineDays != null && (deadlineHours == null || (deadlineHours != null && deadlineHours.equals("0")))) {
                result += "in " + deadlineDays + " day" + (deadlineDays.equals("1") ? "" : "s") + " ";
            } else if(deadlineDays != null && !deadlineDays.equals("0") && deadlineHours != null) {
                result += "in " + deadlineDays + " day" + (deadlineDays.equals("1") ? "" : "s") + "  and " + deadlineHours + " hour" + (deadlineHours.equals("1") ? "" : "s") + " ";
            } else if((deadlineDays == null || deadlineDays.equals("0")) && deadlineHours != null) {
                result += "in " + deadlineHours + " hour" + (deadlineHours.equals("1") ? "" : "s") + " ";
            }

            String participants = "by ";
            if(leaderParticipation) {
                participants += "the leader";
            }
            if(projectBoardParticipation) {
                participants = participants + ((participants.equals("by ")) ? "" : ((!contributorsParticipation && !usersParticipation && !otherParticipation) ? " and ": ", ")) + "the project board";
            }
            if(contributorsParticipation) {
                participants = participants + ((participants.equals("by ")) ? "" : ((!usersParticipation && !otherParticipation) ? " and ": ", ")) + "the contributors";
            }
            if(usersParticipation) {
                participants = participants + ((participants.equals("by ")) ? "" : ((!otherParticipation) ? " and ": ", ")) + "the users";
            }
            if(otherParticipation) {
                participants = participants + ((participants.equals("by ")) ? "" : " and ") + "the group of " + otherRoleParticipation;
            }
            result = result + participants + " of the project ";

            if(strategy.equals("unanimous")) {
                result += "unanimously";
            } else if(strategy.equals("voting")) {
                result += "according to a majority voting process";
                if(democracyRatio.equals("100")) {
                    result += " where everyone agrees";
                } else {
                    result += " with a " + democracyRatio + "% of positive votes";
                }

                if(!democracyMinVotes.equals("0")) {
                    result += " and there " + (democracyMinVotes.equals("1") ? "is" : "are") + ", at least, " + democracyMinVotes + " vote" + (democracyMinVotes.equals("1") ? "" : "s") + ".";
                } else {
                    result += ".";
                }

                if(democracyRange.equals("present")) {
                    result += " To calculate the ratio, only those votes issued at the moment of applying the rule will be counted.";
                } else if (democracyRange.equals("qualified")) {
                    result += " To calculate the ratio, every member will be counted (if someone does not vote it will be counted as negative). ";
                }
            }
        }
		return result;
	}
	
	/**
	 * Generates the string conforming to our DSL. To simplify things, I don't use a model-based approach.
	 * 
	 * @param collaborationType
	 * @param collaborationPhase
	 * @param leaderParticipation
	 * @param projectBoardParticipation
	 * @param contributorsParticipation
	 * @param usersParticipation
	 * @param otherParticipation
	 * @param otherRoleParticipation
	 * @param strategy
	 * @param democracyRange
	 * @param democracyRatio
	 * @param democracyMinVotes
	 * @param deadlineDays
	 * @param deadlineHours
	 * @param noDeadline
	 * @return
	 */
	private String generateDSL(String collaborationType,
			String collaborationPhase, boolean leaderParticipation,
			boolean projectBoardParticipation,
			boolean contributorsParticipation, boolean usersParticipation,
			boolean otherParticipation, String otherRoleParticipation,
			String strategy, String democracyRange, String democracyRatio,
			String democracyMinVotes, String deadlineDays,
			String deadlineHours, boolean noDeadline) {
		String result = "";
		if(democracyRange != null && !democracyRange.equals(""))
			democracyRange = democracyRange.substring(0,1).toUpperCase() + democracyRange.substring(1, democracyRange.length());
		
		if(collaborationType == null || collaborationPhase == null || strategy == null || (!leaderParticipation && !projectBoardParticipation && !contributorsParticipation && !usersParticipation && (!otherParticipation || (otherParticipation && otherRoleParticipation == null))) || (deadlineDays == null && deadlineHours == null && !noDeadline))
            result = "There is an error in the parameters";
        else {
            String when = "";

            if(collaborationPhase.equals("CollaborationAcceptance")) {
            	when = "Task";
            } else if (collaborationPhase.equals("PatchAcceptance")) {
            	when = "Patch";
            } else if (collaborationPhase.equals("ReleaseAcceptance")) {
            	when = "Release ";
            }

            String appliedTo = "";
            if(collaborationType.equals("Bug")) {
            	appliedTo = "Task (tag = 'bug')";
            } else if(collaborationType.equals("Enhancement")) {
            	appliedTo = "Task (tag = 'enhancemend')";
            } else if(collaborationType.equals("Comment")) {
            	appliedTo = "Comment";
            } else if(collaborationType.equals("All")) {
            	appliedTo = "Task";
            }
            
            String participants = "";
            if(leaderParticipation) {
                participants += "Leader";
            }
            if(projectBoardParticipation) {
                participants = participants + (participants.equals("") ? "" : ", ") + "ProjectBoard";
            }
            if(contributorsParticipation) {
                participants = participants + (participants.equals("") ? "" : ", ") + "Contributors";
            }
            if(usersParticipation) {
                participants = participants + (participants.equals("") ? "" : ", ") + "Users";
            }
            if(otherParticipation) {
                participants = participants + (participants.equals("") ? "" : ", ") + otherRoleParticipation;
            }

            String deadline = "";
            if(noDeadline) {
            	deadline += "None";
            } else if(deadlineDays != null && (deadlineHours == null || (deadlineHours != null && deadlineHours.equals("0")))) {
            	deadline += deadlineDays + " day" + (deadlineDays.equals("1") ? "" : "s") + " ";
            } else if(deadlineDays != null && !deadlineDays.equals("0") && deadlineHours != null) {
            	deadline += deadlineDays + " day" + (deadlineDays.equals("1") ? "" : "s") + "  and " + deadlineHours + " hour" + (deadlineHours.equals("1") ? "" : "s") + " ";
            } else if((deadlineDays == null || deadlineDays.equals("0")) && deadlineHours != null) {
            	deadline += deadlineHours + " hour" + (deadlineHours.equals("1") ? "" : "s") + " ";
            }

            String tab = "&nbsp;&nbsp;&nbsp;";
            
            String governanceRule = "";
            if(strategy.equals("unanimous")) {
            	governanceRule = tab + tab + "R1 : LeaderDriven { <br>" +
            			tab + tab + tab + "applied to " + appliedTo + "<br>" + 
            			tab + tab + tab + "when " + when + "<br>" +
            			tab + tab + tab + "default None <br>" +
            			tab + tab + tab + "deadline D1 <br>" +
            			tab + tab + tab + "} <br>" +
            			tab + tab + "}<br>";
            } else if(strategy.equals("voting")) {
                if(democracyRatio.equals("50")) {
                	governanceRule = tab + tab + "R1 : Majority { <br>" +
                			tab + tab + tab + "applied to " + appliedTo + "<br>" + 
                			tab + tab + tab + "when " + when + "<br>" +
                			tab + tab + tab + "people " + participants + "<br>" +
                			tab + tab + tab + "range " + democracyRange + "<br>" +
                			tab + tab + tab + "minVotes " + (democracyMinVotes.equals("0") ? "All" : democracyMinVotes) + "<br>" +
                			tab + tab + tab + "deadline D1 <br>" +
                			tab + tab + tab + "} <br>" +
                			tab + tab + "}<br>"; 
                } else {
                	governanceRule = tab + tab + "R1 : Ratio { <br>" +
                			tab + tab + tab + "applied to " + appliedTo + "<br>" + 
                			tab + tab + tab + "when " + when + "<br>" +
                			tab + tab + tab + "people " + participants + "<br>" +
                			tab + tab + tab + "range " + democracyRange + "<br>" +
                			tab + tab + tab + "minVotes " + (democracyMinVotes.equals("0") ? "All" : democracyMinVotes) + "<br>" +
                			tab + tab + tab + "ratio " + (democracyRatio.equals("100") ? "1" : "0." + democracyRatio) + "<br>" +
                			tab + tab + tab + "deadline D1 <br>" +
                			tab + tab + tab + "} <br>" +
                			tab + tab + "}<br>";
                }
            }

            result = "Project YOUR_PROJECT { <br>" +
            		tab + "Roles: " + participants + "<br>" + 
            		tab + "Deadlines: <br>" +
            		tab + tab + "D1 : " + deadline + "<br>" + 
            		tab + "Rules: <br> " + governanceRule;
            	

        }
		return result;
	}
	
	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		super.doOptions(request, response);

	}
}
