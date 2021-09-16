package com.ingle;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/jrun")
public class JMain extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException , IOException {
		
		List<Student> stu = Arrays.asList(new Student(1,"ajay"),new Student(2,"vijay"));
//		
//		String name = "Ajay";
		req.setAttribute("students", stu);
		RequestDispatcher rd = req.getRequestDispatcher("JDisplay.jsp");
		rd.forward(req, res);
		
	}
}
