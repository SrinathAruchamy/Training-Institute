package com.keane.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.Faculty_Dao;
import com.keane.training.domain.Faculty;

public class Faculty_Data implements HttpRequestHandler{
	
	
	static Logger log = Logger.getLogger(Faculty_Data.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		Faculty_Dao fd=new Faculty_Dao();
		
		try {
			
			List<Faculty> flist=fd.getfaculty();
			request.setAttribute("flist", flist);
			
			RequestDispatcher rd=request.getRequestDispatcher("Faculty_Data.jsp");
			rd.forward(request, response);
		
		} catch (DBConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
