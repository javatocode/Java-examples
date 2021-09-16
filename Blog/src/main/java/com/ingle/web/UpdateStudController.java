package com.ingle.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ingle.web.dao.StudentDao;
import com.ingle.web.model.Student;

public class UpdateStudController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int stuid = Integer.parseInt(request.getParameter("stuid"));
		String stuname = request.getParameter("stuname");
		String stuphone = request.getParameter("stuphone");
		String stucity = request.getParameter("stucity");
		
		StudentDao dao = new StudentDao();
		Student stup = dao.updateStudent(stuid,stuname,stuphone,stucity);
		request.setAttribute("update", stup);
		RequestDispatcher rd = request.getRequestDispatcher("savedata.jsp");
		rd.forward(request, response);
	}

}
