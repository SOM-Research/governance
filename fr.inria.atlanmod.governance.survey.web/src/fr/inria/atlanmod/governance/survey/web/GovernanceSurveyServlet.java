package fr.inria.atlanmod.governance.survey.web;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;


@WebServlet("/governanceSurvey")
public class GovernanceSurveyServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        final String q1 = request.getParameter("q1");
        final String q2 = request.getParameter("q2");
        final String q3 = request.getParameter("q3");
        final String q4 = request.getParameter("q4");
        final String q5 = request.getParameter("q5");

        final Firebase ref = new Firebase("https://governancesurvey.firebaseio.com/results");
        ref.auth("dDD4UvsXqA2kre4m0QRA6qByXwqEcqFHjmIQnvfU", new Firebase.AuthListener() {
            @Override
            public void onAuthError(FirebaseError firebaseError) {
                System.err.println("Authentication in Firebase failed! " + firebaseError.getMessage());
            }

            @Override
            public void onAuthSuccess(Object authData) {
                Firebase child = ref.push();

                Calendar now = Calendar.getInstance();
                Timestamp timeStamp = new Timestamp(now.getTimeInMillis());
                child.child("timestamp").setValue(timeStamp.toString());
                child.child("q1").setValue(q1);
                child.child("q2").setValue(q2);
                child.child("q3").setValue(q3);
                child.child("q4").setValue(q4);
                child.child("q5").setValue(q5);
            }

            @Override
            public void onAuthRevoked(FirebaseError firebaseError) {
                System.err.println("Authentication in Firebase cancelled! " + firebaseError.getMessage());
            }
        });
        ref.unauth();
    }

}
