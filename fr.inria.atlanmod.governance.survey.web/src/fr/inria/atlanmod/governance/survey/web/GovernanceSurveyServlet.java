package fr.inria.atlanmod.governance.survey.web;

import com.google.gson.JsonObject;

import javax.servlet.annotation.WebServlet;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@WebServlet("/survey")
public class GovernanceSurveyServlet extends javax.servlet.http.HttpServlet {
    private static String paramsPattern = Pattern.quote("examples[") + "([a-zA-Z0-9]*)"+ Pattern.quote("][") + "[\\$a-zA-Z0-9]*" + Pattern.quote("]");

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        JsonObject result = new JsonObject();

        Calendar now = Calendar.getInstance();
        Timestamp timeStamp = new Timestamp(now.getTimeInMillis());
        result.addProperty("timestamp", timeStamp.toString());

        final String q0 = request.getParameter("q0");
        result.addProperty("q0", q0);
        final String q1 = request.getParameter("q1");
        result.addProperty("q1", q1);
        final String q2 = request.getParameter("q2");
        result.addProperty("q2", q2);
        final String q3 = request.getParameter("q3");
        result.addProperty("q3", q3);
        final String q4 = request.getParameter("q4");
        result.addProperty("q4", q4);
        final String q5 = request.getParameter("q5");
        result.addProperty("q5", q5);
        final String q6 = request.getParameter("q6");
        result.addProperty("q6", q6);

        Pattern pattern = Pattern.compile(paramsPattern);
//        final HashMap<String, HashMap<String, String>> examples = new HashMap<String, HashMap<String, String>>();
        JsonObject examples = new JsonObject();
        for (Enumeration<String> e = request.getParameterNames() ; e.hasMoreElements() ;) {
            String paramName = e.nextElement();
            Matcher matcher = pattern.matcher(paramName);
            if(matcher.find()) {
                String index = matcher.group(1);
                if(examples.get(index) == null) {
                    JsonObject example = new JsonObject();
//                    HashMap<String, String> values = new HashMap<String, String>();
                    String eq1 = request.getParameter("examples[" + index + "][q1]");
//                    values.put("q1", eq1);
                    example.addProperty("q1", eq1);

                    String eq2 = request.getParameter("examples[" + index + "][q2]");
//                    values.put("q2", eq2);
                    example.addProperty("q2", eq2);

                    String eq3A = request.getParameter("examples[" + index + "][q3A]");
//                    values.put("q3A", eq3A);
                    example.addProperty("q3A", eq3A);

                    String eq3B = request.getParameter("examples[" + index + "][q3B]");
//                    values.put("q3B", eq3B);
                    example.addProperty("q3B", eq3B);

                    String eq3C = request.getParameter("examples[" + index + "][q3C]");
//                    values.put("q3C", eq3C);
                    example.addProperty("q3C", eq3C);

                    String eq3D = request.getParameter("examples[" + index + "][q3D]");
//                    values.put("q3D", eq3D);
                    example.addProperty("q3D", eq3D);

                    String eq4 = request.getParameter("examples[" + index + "][q4]");
//                    values.put("q4", eq4);
                    example.addProperty("q4", eq4);

                    String eq4A = request.getParameter("examples[" + index + "][q4A]");
//                    values.put("q4A", eq4A);
                    example.addProperty("q4A", eq4A);

                    String eq4B = request.getParameter("examples[" + index + "][q4B]");
//                    values.put("q4B", eq4B);
                    example.addProperty("q4B", eq4B);

                    String eq4C = request.getParameter("examples[" + index + "][q4C]");
//                    values.put("q4C", eq4C);
                    example.addProperty("q4C", eq4C);

                    String eq5A = request.getParameter("examples[" + index + "][q5A]");
//                    values.put("q5A", eq5A);
                    example.addProperty("q5A", eq5A);

                    String eq5B = request.getParameter("examples[" + index + "][q5B]");
//                    values.put("q5B", eq5B);
                    example.addProperty("q5B", eq5B);

                    String eq5C = request.getParameter("examples[" + index + "][q5C]");
//                    values.put("q5C", eq5C);
                    example.addProperty("q5C", eq5C);

                    String rule = request.getParameter("examples[" + index + "][rule]");
//                    values.put("rule", rule);
                    example.addProperty("rule", rule);

                    examples.add("example" + index, example);
                }
            }
        }
        result.add("examples", examples);

        synchronized (this) {
            String fileName = "answer-" + Calendar.getInstance().getTimeInMillis();
            String path = getServletContext().getRealPath("/WEB-INF/");
            File resultFile = new File(path + File.separator + fileName + ".json");
            PrintWriter pw = new PrintWriter(resultFile);
            pw.print(result.toString());;
            pw.close();
        }

//        final Firebase ref = new Firebase("https://governancesurvey.firebaseio.com/results");
//        Firebase child = ref.push();
//
//        Calendar now = Calendar.getInstance();
//        Timestamp timeStamp = new Timestamp(now.getTimeInMillis());
//        child.child("timestamp").setValue(timeStamp.toString());
//        child.child("q0").setValue(q0);
//        child.child("q1").setValue(q1);
//        child.child("q2").setValue(q2);
//        child.child("q3").setValue(q3);
//        child.child("q4").setValue(q4);
//        child.child("q5").setValue(q5);
//        child.child("q6").setValue(q6);
//        child.child("examples").setValue(examples);

//        JSONObject payload = new JSONObject();
//        try {
//            payload.put("user", "servlet");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        TokenGenerator tokenGenerator = new TokenGenerator("dDD4UvsXqA2kre4m0QRA6qByXwqEcqFHjmIQnvfU");
//        TokenOptions options = new TokenOptions();
//        options.setAdmin(true);
//        options.setDebug(true);
//        String token = tokenGenerator.createToken(payload, options);
//
//        System.err.println("Authenticating");
//        ref.auth(token, new Firebase.AuthListener() {
//            @Override
//            public void onAuthError(FirebaseError firebaseError) {
//                System.err.println("Authentication in Firebase failed! " + firebaseError.getMessage());
//            }
//
//            @Override
//            public void onAuthSuccess(Object o) {
//                System.err.println("Authentication in Firebase succeed! " + o);
//                Firebase child = ref.push();
//
//                Calendar now = Calendar.getInstance();
//                Timestamp timeStamp = new Timestamp(now.getTimeInMillis());
//                child.child("timestamp").setValue(timeStamp.toString());
//                child.child("q0").setValue(q0);
//                child.child("q1").setValue(q1);
//                child.child("q2").setValue(q2);
//                child.child("q3").setValue(q3);
//                child.child("q4").setValue(q4);
//                child.child("q5").setValue(q5);
//                child.child("examples").setValue(examples);
//            }
//
//            @Override
//            public void onAuthRevoked(FirebaseError firebaseError) {
//                System.err.println("Authentication in Firebase revoked! " + firebaseError.getMessage());
//            }
//        });
//        System.err.println("Unauthenticating");
//        ref.unauth();
    }

}
