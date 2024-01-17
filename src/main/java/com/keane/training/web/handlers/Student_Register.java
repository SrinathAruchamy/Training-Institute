package com.keane.training.web.handlers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.keane.dbcon.DBConnectionException;
import com.keane.dbfw.DBFWException;
import com.keane.mvc.HttpRequestHandler;
import com.keane.training.dao.DAOAppException;
import com.keane.training.dao.Student_Dao;
import com.keane.training.domain.Student;

public class Student_Register implements HttpRequestHandler{
	
	static Logger log = Logger.getLogger(Student_Register.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student_Dao st=new Student_Dao();
		
		Student user=new Student();
		
		user.setStudent_Id(request.getParameter("studentid"));
		user.setName(request.getParameter("name"));
		user.setQualification(request.getParameter("qualification"));
		user.setContact_Number(Long.parseLong(request.getParameter("contact")));
		user.setAddress(request.getParameter("address"));
		user.setEmail_Id(request.getParameter("email"));
		user.setUser_Id(Integer.parseInt(request.getParameter("userid")));
	
		boolean isExists;
		try {
			
			isExists=st.validateUser(user.getStudent_Id());
			
			if(isExists) {
				
				log.info("User already registered");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Student_Register.jsp");
				request.setAttribute("Err",	"User already registered");
				dispatcher.forward(request, response);
			} else 
			{
				
				user.setPassword("Student@"+ Integer.toString(user.getUser_Id()));
				int finalRes = st.register_student(user);
				
				if (finalRes > 0) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("Student_Register_success.jsp");
					request.setAttribute("success","User succesfully registered with the system");
					request.setAttribute("details", user);
					dispatcher.forward(request, response);
				}
				}
		}catch(DAOAppException e) {
			
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("erroe.jsp");
			request.setAttribute("Err", e.getMessage());
			dispatcher.forward(request, response);
		} catch (DBConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DBFWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
