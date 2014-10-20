package fr.inria.atlanmod.governance.survey.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SuppressWarnings("serial")
public abstract class AbstractGovernanceServlet extends javax.servlet.http.HttpServlet {
	
	String serverURL = "";
	
	public void init() throws ServletException {
		super.init();
		Properties properties = new Properties();
		try	{
			properties.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		serverURL = properties.getProperty("serverURL");
	}
	
	/**
	 * Builds the response options to deal with CORS
	 * 
	 * @param response
	 */
	protected void addResponseOptions(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", serverURL);
		response.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
		response.addHeader("Access-Control-Allow-Credentials", "true");
	}
	
	protected JsonObject digestParams(HttpServletRequest request) throws ServletException {
		// Getting the parameters from the request
		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null)
				jb.append(line);
		} catch (Exception e) {
			throw new ServletException("There was an error reading the parameters");
		}
		// Parsing the parameters
		Gson gson = new Gson();
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(jb.toString()).getAsJsonObject();
		
		return jsonObject;
	}
}
