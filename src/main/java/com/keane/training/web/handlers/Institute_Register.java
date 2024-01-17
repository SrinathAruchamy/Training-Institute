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
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.Institute_Dao;
import com.keane.training.domain.Institute;

public class Institute_Register implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Institute_Register.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String Institute_Id=request.getParameter("instituteid");
		String Institute_Name=request.getParameter("institutename");
		String Affiliation_Date=request.getParameter("affiliationdate");
		String Address=request.getParameter("address");
		int Number_Of_Course=Integer.parseInt(request.getParameter("course"));
		int Number_Of_Seats=Integer.parseInt(request.getParameter("seats"));
		String Password=request.getParameter("password");
		
		Institute i=new Institute(Institute_Id, Institute_Name, Affiliation_Date, Address, Number_Of_Course, Number_Of_Seats, Password);
		
		Institute_Dao id=new Institute_Dao();
		boolean isExists;
		try {
			isExists=id.validateUser(i.getInstitute_Id());
			
			if(isExists) {
				
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Institute_Register.jsp");
				request.setAttribute("Err",	"Already registered with the system !");
				dispatcher.forward(request, response);
			}else {
				
				if(Institute_Dao.register_institute(i)==1) {
					RequestDispatcher rd = request.getRequestDispatcher("Institute_Register.jsp");
					request.setAttribute("success","User succesfully registered ");
					rd.forward(request, response);
				}
			}

		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DAOAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}
}
