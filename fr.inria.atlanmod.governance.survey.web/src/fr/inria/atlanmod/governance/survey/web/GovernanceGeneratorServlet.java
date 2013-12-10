package fr.inria.atlanmod.governance.survey.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/generator")
public class GovernanceGeneratorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String collaborationType = request.getParameter("q1");
        String collaborationPhase = request.getParameter("q2");
        boolean leaderParticipation = (request.getParameter("q3A") != null && request.getParameter("q3A").equals("true")) ? true : false;
        boolean projectBoardParticipation = (request.getParameter("q3B") != null && request.getParameter("q3B").equals("true")) ? true : false;
        boolean contributorsParticipation = (request.getParameter("q3C") != null && request.getParameter("q3C").equals("true")) ? true : false;
        boolean usersParticipation = (request.getParameter("q3D") != null && request.getParameter("q3D").equals("true")) ? true : false;
        String strategy = request.getParameter("q4");
        String democracyRange = request.getParameter("q4A");
        String democracyRatio = request.getParameter("q4B");
        String democracyMinVotes = request.getParameter("q4C");
        String deadlineDays = request.getParameter("q5A");
        String deadlineHours = request.getParameter("q5B");
        String noDeadline = request.getParameter("q5C");


        if(collaborationType == null || collaborationPhase == null || strategy == null)
            throw new ServletException("Parameters missing in the call");

        String result = "This is the strategy";

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
            result = "All the " + prePhaseString + " bugs will be accepted or rejected " + postPhaseString;
        } else if(collaborationType.equals("Enhancement")) {
            result = "All the " + prePhaseString + " enhancements will be accepted or rejected " + postPhaseString;
        } else if(collaborationType.equals("Comment")) {
            result = "All the " + prePhaseString + " comments will be accepted or rejected " + postPhaseString;
        } else if(collaborationType.equals("All")) {
            result = "All the " + prePhaseString + " bugs, enhancements and comments will be accepted or rejected " + postPhaseString;
        }

        if(noDeadline.equals("true")) {
            result += "without deadline ";
        } else if(deadlineDays != null && (deadlineHours == null || (deadlineHours != null && deadlineHours.equals("0")))) {
            result += "in " + deadlineDays + " day" + (deadlineDays.equals("1") ? "" : "s") + " ";
        } else if(deadlineDays != null && !deadlineDays.equals("0") && deadlineHours != null) {
            result += "in " + deadlineDays + " day" + (deadlineDays.equals("1") ? "" : "s") + "  and " + deadlineHours + " hour" + (deadlineHours.equals("1") ? "" : "s") + " ";
        } else if((deadlineDays == null || deadlineDays.equals("0")) && deadlineHours != null) {
            result += "in " + deadlineHours + " hour" + (deadlineHours.equals("1") ? "" : "s") + " ";
        }

        String participants = "by the ";
        if(leaderParticipation) {
            participants += "leader";
        }
        if(projectBoardParticipation) {
            participants = participants + ((participants.equals("by the ")) ? "" : ((!contributorsParticipation && !usersParticipation) ? " and ": ", ")) + "the project board";
        }
        if(contributorsParticipation) {
            participants = participants + ((participants.equals("by the ")) ? "" : ((!usersParticipation) ? " and ": ", ")) + "the contributors";
        }
        if(usersParticipation) {
            participants = participants + " and the users";
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
                result += " and there" + (democracyMinVotes.equals("1") ? "is" : "are") + ", at least, " + democracyMinVotes + " vote" + (democracyMinVotes.equals("1") ? "" : "s") + ".";
            } else {
                result += ".";
            }

            if(democracyRange.equals("present")) {
                result += " To calculate the ratio, only the votes presented in the moment of applying the rule will be counted.";
            } else if (democracyRange.equals("qualified")) {
                result += " To calculate the ratio, every member will be counted (if someone does ont vote it will count as negative). ";
            }
        }

        PrintWriter out = response.getWriter();
        out.print(result);



    }
}
