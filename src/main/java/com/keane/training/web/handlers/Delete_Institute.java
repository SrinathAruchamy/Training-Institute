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
import com.keane.training.domain.Delete;

public class Delete_Institute implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Delete_Institute.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String Institute_Id=request.getParameter("institute");
		
		Delete i=new Delete(Institute_Id);
		
		Institute_Dao id=new Institute_Dao();
		
		boolean isExists;
		
		try {
			isExists=id.validateDelete(i.getInstitute_Id());
			if(!isExists) {
				
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Admin_Operations.jsp");
				request.setAttribute("Err",	"User already exists!");
				dispatcher.forward(request, response);
			} 
			else {
				int finalRes = id.delete_institute(i);
				if(finalRes>0) {
					RequestDispatcher rd=request.getRequestDispatcher("Admin_Operations.jsp");
					request.setAttribute("success","succesfully");
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
