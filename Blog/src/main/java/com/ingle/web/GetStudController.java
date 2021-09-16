package com.ingle.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ingle.web.dao.StudentDao;
import com.ingle.web.model.Student;

public class GetStudController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		
		StudentDao dao = new StudentDao();
		Student stu = dao.getStudent(sid);
	
		request.setAttribute("data", stu);
		
		RequestDispatcher rd = request.getRequestDispatcher("studblog.jsp");
		
		rd.forward(request, response);
		
		
		
	}
	
}
