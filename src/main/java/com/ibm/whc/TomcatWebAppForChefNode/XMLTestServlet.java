package com.ibm.whc.TomcatWebAppForChefNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XMLTestServlet
 */
public class XMLTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().println("Webapp Home: " + new File("${CATALINA_HOME}/webapps/TomcatWebAppForChefNode").getCanonicalPath());
		response.getWriter().println(new ArrayList<String>(Arrays.asList(new File("/home/vravish/apache-tomcat-8.0.36/webapps/TomcatWebAppForChefNode/").list())));
//		BufferedReader br = new BufferedReader(new FileReader("/home/vravish/apache-tomcat-8.0.36/webapps/TomcatWebAppForChefNode/TEST-com.ibmwatsonhealth.devopsservices.swaggertestasset.TestNGTestSuite.xml"));
//		for (String line = br.readLine(); line != null; line = br.readLine()) {
//			response.getWriter().println(line);
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
