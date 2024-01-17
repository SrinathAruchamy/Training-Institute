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
import com.keane.training.dao.Institute_Dao;

public class Institute_login implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Institute_login.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		String name=request.getParameter("institute");
		String password=request.getParameter("password");
		
		Institute_Dao ins=new Institute_Dao();
		List list=null;
		try {
			list=ins.login_institute(name, password);
			
			if(list.size()>0) {
			HttpSession ses=request.getSession();
			ses.setAttribute("app_user", name);
			RequestDispatcher rd=request.getRequestDispatcher("Institute_Operations.jsp");
			rd.forward(request, response);
			}
			else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Institute_login.jsp");
				request.setAttribute("Err","Name and Password is Incorrect");
				dispatcher.forward(request, response);
			}
			
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
