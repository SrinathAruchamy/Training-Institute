package com.keane.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.Request_Dao;
import com.keane.training.dao.Response_Dao;
import com.keane.training.domain.Request;
import com.keane.training.domain.Response;

public class Request_Institute implements HttpRequestHandler{
	static Logger log = Logger.getLogger(Request_Institute.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		int Request_Id=Integer.parseInt(request.getParameter("request"));
		String Message=request.getParameter("message");
		String Student_Id=request.getParameter("studentid");
		
		
		Request re=new Request(Request_Id,Message,Student_Id);
		
		Request_Dao rd=new Request_Dao();
		
		boolean isExists;
		try {
			
			isExists=rd.validateUser(re.getRequest_Id());
			
			if(isExists) {
				
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Request.jsp");
				request.setAttribute("Err",	"Already exists with the system");
				dispatcher.forward(request, response);
			}
			if(Request_Dao.request_institute(re)==1) {
				RequestDispatcher rd1=request.getRequestDispatcher("success.jsp");
				request.setAttribute("success","User succesfully requested to institute");
				rd1.forward(request, response);
				
			}else {
				out.print("Not responded");
			}
		} catch (DBConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DAOAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
