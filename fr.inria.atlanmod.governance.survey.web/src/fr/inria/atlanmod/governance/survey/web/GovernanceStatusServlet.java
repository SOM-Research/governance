package fr.inria.atlanmod.governance.survey.web;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Simple Servlet to know the status of the service
 */
@WebServlet("/status")
public class GovernanceStatusServlet extends AbstractGovernanceServlet {
	private static final long serialVersionUID = 12L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		addResponseOptions(resp);
		
        PrintWriter out = resp.getWriter();
        out.println("Servlets running...");

        out.println("Server URL: " + serverURL);
        
        synchronized (this) {
            String realPathString = getServletContext().getRealPath("/WEB-INF/");
            File realPath = new File(realPathString);
            int counter = 0;
            if(realPath.isDirectory())
                for(File file : realPath.listFiles())
                    if(file.isFile() && file.getName().startsWith("answer") && file.getName().endsWith(".json"))
                        counter++;
            out.println("Number of answers: " + counter);
        }
        
        
    }

	@Override
	protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addResponseOptions(response);
	}
	
}
