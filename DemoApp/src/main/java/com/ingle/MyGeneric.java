/**
 * 
 */
package com.ingle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * @author Ajay's
 *
 */

@WebServlet("/gen")
public class MyGeneric extends GenericServlet {

	
	// only write service method..
	public void service(ServletRequest req , ServletResponse resp) throws ServletException , IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>vijay gerneric here..</h1>");
	}
}
