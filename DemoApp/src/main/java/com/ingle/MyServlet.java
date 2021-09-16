package com.ingle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet  {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException {
		
		PrintWriter out = res.getWriter();
		out.println("Hi ");
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
		ServletConfig cg = getServletConfig();
		String str1 = cg.getInitParameter("name");
		out.println(str1);
	}
}
