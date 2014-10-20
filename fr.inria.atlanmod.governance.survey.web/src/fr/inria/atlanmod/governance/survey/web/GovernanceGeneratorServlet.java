package fr.inria.atlanmod.governance.survey.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


/**
 * This servlet generates the english verbalization of a governance rule. The options are included in the parameters
 * of the POST call.
 *
 * @author Javier Canovas (me@jlcanovas.es)
 */
@WebServlet("/generator")
public class GovernanceGeneratorServlet extends AbstractGovernanceServlet {
	private static final long serialVersionUID = 90L;
	public final static String DEFAULT_LANGUAGE = "en"; 
	
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    	addResponseOptions(response);
		
		JsonObject jsonObject = digestParams(request);
    	
    	String language = jsonObject.get("language").getAsString();
    	if(language == null) language = DEFAULT_LANGUAGE;
    	
    	JsonObject rule = jsonObject.get("rule").getAsJsonObject();
    	
        String collaborationType = rule.get("collaborationType").getAsString();
        String collaborationPhase = rule.get("collaborationPhase").getAsString();

        JsonObject people = rule.get("people").getAsJsonObject();
        boolean leaderParticipation = people.get("leader").getAsBoolean();
        boolean projectBoardParticipation = people.get("projectBoard").getAsBoolean();
        boolean contributorsParticipation = people.get("contributors").getAsBoolean();
        boolean usersParticipation = people.get("users").getAsBoolean();
        boolean otherParticipation = people.get("other").getAsBoolean();
        String otherRoleParticipation = people.get("otherRole").getAsString();

        String strategy = rule.get("strategy").getAsString();
        String democracyRange = (rule.has("democracyRange")) ? rule.get("democracyRange").getAsString() : "";
        String democracyRatio = rule.get("democracyRatio").getAsString();
        String democracyMinVotes = rule.get("democracyMinVotes").getAsString();
        
        String deadlineDays = rule.get("deadlineDays").getAsString();
        String deadlineHours = rule.get("deadlineHours").getAsString();
        boolean noDeadline = rule.get("noDeadline").getAsBoolean();

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
            	when = "TaskReview";
            } else if (collaborationPhase.equals("PatchAcceptance")) {
            	when = "PatchReview";
            } else if (collaborationPhase.equals("ReleaseAcceptance")) {
            	when = "Release";
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
		addResponseOptions(response);
	}
	
}
