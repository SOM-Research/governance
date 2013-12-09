package fr.inria.atlanmod.governance.survey.web;

import com.firebase.client.Firebase;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@WebServlet("/survey")
public class GovernanceSurveyServlet extends javax.servlet.http.HttpServlet {
    private static String paramsPattern = Pattern.quote("examples[") + "([a-zA-Z0-9]*)"+ Pattern.quote("][") + "[\\$a-zA-Z0-9]*" + Pattern.quote("]");

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        final String q0 = request.getParameter("q0");
        final String q1 = request.getParameter("q1");
        final String q2 = request.getParameter("q2");
        final String q3 = request.getParameter("q3");
        final String q4 = request.getParameter("q4");
        final String q5 = request.getParameter("q5");

        Pattern pattern = Pattern.compile(paramsPattern);
        final HashMap<String, HashMap<String, String>> examples = new HashMap<String, HashMap<String, String>>();
        for (Enumeration<String> e = request.getParameterNames() ; e.hasMoreElements() ;) {
            String paramName = e.nextElement();
            Matcher matcher = pattern.matcher(paramName);
            if(matcher.find()) {
                System.out.println("In!");
                String index = matcher.group(1);
                if(examples.get(index) == null) {
                    HashMap<String, String> values = new HashMap<String, String>();
                    String eq1 = request.getParameter("examples[" + index + "][q1]");
                    values.put("q1", eq1);
                    String eq2 = request.getParameter("examples[" + index + "][q2]");
                    values.put("q2", eq2);
                    String eq3 = request.getParameter("examples[" + index + "][q3]");
                    values.put("q3", eq3);
                    String eq3A = request.getParameter("examples[" + index + "][q3A]");
                    values.put("q3A", eq3A);
                    String eq3B = request.getParameter("examples[" + index + "][q3B]");
                    values.put("q3B", eq3B);
                    String eq3C = request.getParameter("examples[" + index + "][q3C]");
                    values.put("q3C", eq3C);
                    String eq4A = request.getParameter("examples[" + index + "][q4A]");
                    values.put("q4A", eq4A);
                    String eq4B = request.getParameter("examples[" + index + "][q4B]");
                    values.put("q4B", eq4B);
                    String eq4C = request.getParameter("examples[" + index + "][q4C]");
                    values.put("q4C", eq4C);
                    String rule = request.getParameter("examples[" + index + "][rule]");
                    values.put("rule", rule);
                    examples.put(index, values);
                }
            }
        }

        final Firebase ref = new Firebase("https://governancesurvey.firebaseio.com/results");
        Firebase child = ref.push();

        Calendar now = Calendar.getInstance();
        Timestamp timeStamp = new Timestamp(now.getTimeInMillis());
        child.child("timestamp").setValue(timeStamp.toString());
        child.child("q0").setValue(q0);
        child.child("q1").setValue(q1);
        child.child("q2").setValue(q2);
        child.child("q3").setValue(q3);
        child.child("q4").setValue(q4);
        child.child("q5").setValue(q5);
        child.child("examples").setValue(examples);

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
