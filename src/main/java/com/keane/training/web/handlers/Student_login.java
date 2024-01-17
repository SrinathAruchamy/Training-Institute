package com.keane.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.Student_Dao;
import com.keane.training.domain.Student;

public class Student_login implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Student_login.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		
		String Student_Id = request.getParameter("studentid");
		String password = request.getParameter("password");
		
		
		int flag = -1;
		List users = null;
		Student_Dao dao = new Student_Dao();
		try {
			users = dao.login_student(Student_Id);
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info(users);
		for (Object object : users) {

			Student user = (Student) object;
			if (user.getPassword().equals(password)) { // check role
				flag = 0;
				break;
			}
		}
		
		
		
		log.info("Flag in login " + flag);
		if (flag == 0) {
			HttpSession mysession=request.getSession();
			mysession.setAttribute("userId", String.valueOf(Student_Id));
			RequestDispatcher dispatcher = request.getRequestDispatcher("Student_login_success.jsp");
			dispatcher.forward(request, response);

		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Student_login.jsp");
			request.setAttribute("Err","User Id and Password is Incorrect");
			dispatcher.forward(request, response);
		}

	}


}
