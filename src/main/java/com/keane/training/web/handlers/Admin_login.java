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

import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.Admin_Dao;

public class Admin_login implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Admin_login.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		Admin_Dao admin=new Admin_Dao();
		List list=null;
		try {
			list=admin.login_admin(userid, password);
			
			if(list.size()>0) {
			HttpSession ses=request.getSession();
			ses.setAttribute("app_user", userid);
			RequestDispatcher rd=request.getRequestDispatcher("Admin_Operations.jsp");
			rd.forward(request, response);
			}
			else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("Admin_login.jsp");
				request.setAttribute("Err","User Id and Password is Incorrect");
				dispatcher.forward(request, response);
			}
			
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DBConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
