package com.keane.training.web.handlers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.Approve_Dao;
import com.keane.training.dao.DAOAppException;
import com.keane.training.domain.Approval;

public class Approve_Institute implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Approve_Institute.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String Institute_Id=request.getParameter("institute");
		String  Approval_Status=request.getParameter("approve");
		
		
		Approval ap=new Approval(Approval_Status,Institute_Id);
		
		Approve_Dao ad=new Approve_Dao();
		
		boolean isExists;
		try {
			
			isExists=ad.validateUser(Approval_Status);
			
			if(!(isExists)==false) {
				
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Admin_Operations.jsp");
				request.setAttribute("Error",	"User already exists!");
				dispatcher.forward(request, response);
				}
			
			else{
				
				int finalRes = Approve_Dao.approve_institute(ap);
				if(finalRes>0) {
					RequestDispatcher rd=request.getRequestDispatcher("Admin_Operations.jsp");
					request.setAttribute("Done","succesfully !");
					rd.forward(request, response);
			}
			
			}
		}
			
				
		catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DAOAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
	


