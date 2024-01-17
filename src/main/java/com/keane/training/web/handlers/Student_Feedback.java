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
import com.keane.training.dao.Feedback_Dao;
import com.keane.training.dao.Request_Dao;
import com.keane.training.domain.Feedback;
import com.keane.training.domain.Request;

public class Student_Feedback implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Student_Feedback.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		int Feedback_Id=Integer.parseInt(request.getParameter("feedbackid"));
		String Feedback=request.getParameter("feedback");
		String Student_Id=request.getParameter("studentid");
		
		Feedback f=new Feedback(Feedback_Id, Feedback, Student_Id);
		
		Feedback_Dao fd=new Feedback_Dao();
		
		boolean isExists;
		try {
			
			isExists=fd.validateUser(f.getFeedback_Id());
			
			if(isExists) {
				
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Student_Feedback.jsp");
				request.setAttribute("Err",	"Already registered with the system");
				dispatcher.forward(request, response);
			}
			else{
				int finalRes=Feedback_Dao.feedback(f);
				if(finalRes>0) {
					
					RequestDispatcher rd1=request.getRequestDispatcher("success.jsp");
					request.setAttribute("success","Feedback succesfully sent to institute");
					rd1.forward(request, response);
				}
				
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
