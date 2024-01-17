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
import com.keane.training.dao.Request_Dao;
import com.keane.training.dao.Response_Dao;
import com.keane.training.domain.Request;
import com.keane.training.domain.Response;

public class Response_Details implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Response_Details.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		Response_Dao r=new Response_Dao();
		
		try {
			
			List<Response> rlist=r.getresponse();
			request.setAttribute("rlist", rlist);
			
			RequestDispatcher rd=request.getRequestDispatcher("View_Response.jsp");
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
