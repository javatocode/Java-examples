package com.ingle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet {

	ServletConfig conf;
	// init servlet
	
	public void init(ServletConfig conf) {
		System.out.println("Intializing servlet");
	}
	
	public void service(ServletRequest req , ServletResponse resp) throws ServletException , IOException {
		System.out.println("Servicing..");
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		p.println("<h1>Ajay Here...</h1>");
	}
	
	public void destroy() {
		System.out.println("destroing...");
	}
	
	// non life servlet
	
	public ServletConfig getServletConfig() {
		return this.conf;
		
	}
	
	public String getServletInfo() {
		return "this is servelt info..";
		
	}
}
