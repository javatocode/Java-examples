package com.ingle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cal")
public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		int l = i - j ;
		int m = i*j;
		int n = i/j;
//		PrintWriter out = resp.getWriter();
//		out.println("Addition result is : " + k );
//		out.println("Substraction result is : " + l );
//		out.println("Multiplication result is :" + m);
//		out.println("Division result is :" + n);
		
		
		// cookies for sending data to other servelt
		
		Cookie cookie  = new Cookie("add",k+"");
		resp.addCookie(cookie);
		resp.sendRedirect("sq");
//		
		
		
		// session for sending value to other servlet
		
//		HttpSession session = req.getSession();
//		session.setAttribute("add", k);
//		resp.sendRedirect("sq");
		
		
		
//		url resp sending redirect
//		
//     	resp.sendRedirect("sq?k="+k);
		
		
//		pass value to another servlet
//       req.setAttribute("key", k);
//		
//		request dispatcher
//		
//       RequestDispatcher rd = req.getRequestDispatcher("sq");
//      rd.forward(req, resp);
	}
	
}
