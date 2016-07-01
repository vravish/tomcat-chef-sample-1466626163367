package com.ibm.whc.TomcatWebAppForChefNode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
public class AdditionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	int a = Integer.parseInt(request.getParameter("a"));
    	int b = Integer.parseInt(request.getParameter("b"));
    	int sum = a+b;
    	response.getWriter().println("07-01-16 11:42: The sum of the two numbers is " + sum + ".");
    	response.getWriter().println("The exit status will be: " + sum % 2);
    	response.addIntHeader("exitstatus", sum % 2);
    }

}
