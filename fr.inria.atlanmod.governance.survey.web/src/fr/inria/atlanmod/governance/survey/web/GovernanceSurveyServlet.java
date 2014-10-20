package fr.inria.atlanmod.governance.survey.web;

import com.google.gson.JsonObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This servlet takes the results of the governance survey and store them in a file
 *
 * @author Javier Canovas (me@jlcanovas.es)
 */
@WebServlet("/survey")
public class GovernanceSurveyServlet extends AbstractGovernanceServlet { 
	private static final long serialVersionUID = 7L;
	private static String paramsPattern = Pattern.quote("examples[") + "([a-zA-Z0-9]*)"+ Pattern.quote("][") + "[\\$a-zA-Z0-9]*" + Pattern.quote("]");

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    	addResponseOptions(response);
        JsonObject result = new JsonObject();

        Calendar now = Calendar.getInstance();
        Timestamp timeStamp = new Timestamp(now.getTimeInMillis());
        result.addProperty("timestamp", timeStamp.toString());

        // Simple questions (no need to check values)
        String q0 = request.getParameter("q0");
        result.addProperty("q0", q0);
        String q1 = request.getParameter("q1");
        result.addProperty("q1", q1);
        String q2 = request.getParameter("q2");
        result.addProperty("q2", q2);
        String q3 = request.getParameter("q3");
        result.addProperty("q3", q3);
        String q4 = request.getParameter("q4");
        result.addProperty("q4", q4);
        String q5 = request.getParameter("q5");
        result.addProperty("q5", q5);
        String q6 = request.getParameter("q6");
        result.addProperty("q6", q6);

        // Analyzing the payload including the rule examples
        Pattern pattern = Pattern.compile(paramsPattern);
        JsonObject examples = new JsonObject();
        for (Enumeration<String> e = request.getParameterNames() ; e.hasMoreElements() ;) {
            String paramName = e.nextElement();
            Matcher matcher = pattern.matcher(paramName);
            if(matcher.find()) {
                String index = matcher.group(1);
                if(examples.get(index) == null) {
                    JsonObject example = new JsonObject();
                    String eq1 = request.getParameter("examples[" + index + "][q1]");
                    example.addProperty("q1", eq1);

                    String eq2 = request.getParameter("examples[" + index + "][q2]");
                    example.addProperty("q2", eq2);

                    String eq3A = request.getParameter("examples[" + index + "][q3A]");
                    example.addProperty("q3A", eq3A);

                    String eq3B = request.getParameter("examples[" + index + "][q3B]");
                    example.addProperty("q3B", eq3B);

                    String eq3C = request.getParameter("examples[" + index + "][q3C]");
                    example.addProperty("q3C", eq3C);

                    String eq3D = request.getParameter("examples[" + index + "][q3D]");
                    example.addProperty("q3D", eq3D);

                    String eq4 = request.getParameter("examples[" + index + "][q4]");
                    example.addProperty("q4", eq4);

                    String eq4A = request.getParameter("examples[" + index + "][q4A]");
                    example.addProperty("q4A", eq4A);

                    String eq4B = request.getParameter("examples[" + index + "][q4B]");
                    example.addProperty("q4B", eq4B);

                    String eq4C = request.getParameter("examples[" + index + "][q4C]");
                    example.addProperty("q4C", eq4C);

                    String eq5A = request.getParameter("examples[" + index + "][q5A]");
                    example.addProperty("q5A", eq5A);

                    String eq5B = request.getParameter("examples[" + index + "][q5B]");
                    example.addProperty("q5B", eq5B);

                    String eq5C = request.getParameter("examples[" + index + "][q5C]");
                    example.addProperty("q5C", eq5C);

                    String rule = request.getParameter("examples[" + index + "][rule]");
                    example.addProperty("rule", rule);

                    examples.add("example" + index, example);
                }
            }
        }
        result.add("examples", examples);

        // Writing to disk
        synchronized (this) {
            String fileName = "answer-" + Calendar.getInstance().getTimeInMillis();
            String path = getServletContext().getRealPath("/WEB-INF/");
            File resultFile = new File(path + File.separator + fileName + ".json");
            PrintWriter pw = new PrintWriter(resultFile);
            pw.print(result.toString());
            pw.close();
        }
    }
    
    @Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addResponseOptions(response);
	}

}
