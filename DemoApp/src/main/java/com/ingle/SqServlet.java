package com.ingle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
	
//		 get value from servlet
//		
//		int d  = (int) req.getAttribute("key");
//		d = d  * d;
//		PrintWriter out = resp.getWriter();
//		out.println("Square of No by dispatcher : " + d);
//		
		
		int u = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if(c.getName().equals("add")) {
				u = Integer.parseInt(c.getValue());
			}
		}
		u = u *u;
		PrintWriter out = resp.getWriter();
		out.println("Square of No by cookie : " + u);
//		
		

		
		resp.setContentType("text/html");
      RequestDispatcher rd = req.getRequestDispatcher("index.html");
     rd.include(req, resp);
		
		
		// get session value 
		
//		HttpSession session = req.getSession();
//		int u = (int)session.getAttribute("add");
//		u = u *u;
//		PrintWriter out = resp.getWriter();
//		out.println("Square of No by session : " + u);
		
		
		
		// get send request and executed redirect
//		
//		int u = Integer.parseInt(req.getParameter("k"));
//		u = u *u;
//		PrintWriter out = resp.getWriter();
//		out.println("Square of No by redirect : " + u);
//	
	}
}
