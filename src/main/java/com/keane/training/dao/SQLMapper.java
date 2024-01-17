package com.keane.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.keane.dbfw.ResultMapper;
import com.keane.training.domain.Admin;
import com.keane.training.domain.Approval;
import com.keane.training.domain.Article;
import com.keane.training.domain.Complaint;
import com.keane.training.domain.Faculty;
import com.keane.training.domain.Feedback;
import com.keane.training.domain.Institute;
import com.keane.training.domain.Request;
import com.keane.training.domain.Response;
import com.keane.training.domain.Student;


public class SQLMapper {
	
	
	public static final String INSERTINSTITUTE="insert into institute values(?,?,?,?,?,?,?)";
	
	public static final String INSERTSTUDENT="insert into student values(?,?,?,?,?,?,?,?)";
	
	public static final String FETCHLOGINADMIN="select User_Id,Password from admin where User_Id=? and Password=?";
	
	public static final String FETCHlOGININSTITUTE="select Institute_Name,Password from institute where Institute_Name=? and Password=?";
	
	public static final String FETCHLOGINSTUDENT="select Student_Id,Password from student where Student_Id=?";
	
	
	//Admin Operations
	
	public static final String OPERATIONADMINAPPROVE="update approval set Approval_Status=? where Institute_Id=?";
	
	public static final String OPERATIONADMINDELETE="delete from institute where Institute_Id=?";
	
	public static final String OPERATIONADMINSTUDENT="select * from student";
	
	public static final String OPERATIONADMINCOMPLAINT="select * from complaint";
	
	//Institute Operations
	
	public static final String OPERATIONINSTITUTESTUDENT="select * from student";
	
	public static final String OPERATIONINSTITUTEARTICLE="insert into article values(?,?,?)";
	
	public static final String OPERATIONINSTITUTEFACULTY="select * from faculty";
	
	public static final String OPERATIONINSTITUTEUPDATE="update institute set Number_of_Course=? where Institute_Id=?";
	
	public static final String OPERATIONINSTITUTERESPONSE="insert into response values(?,?,?,?)";
	
	public static final String OPERATIONINSTITUTEREQUEST="select * from request";
	
	public static final String OPERATIONINSTITUTEFEEDBACK="select * from feedback";
	
	//Student Operation
	
	public static final String OPERATIONSTUDENTUPDATE="update student set Contact_Number=? where Student_Id=?";
	
	public static final String OPERATIONSTUDENTREQUEST="insert into request values(?,?,?)";
	
	public static final String OPERATIONSTUDENTRESPONSE="select * from response";
	
	public static final String OPERATIONSTUDENTFEEDBACK="insert into feedback values(?,?,?)";
	
	//validate Operation
	
	public static final String VALIDATESTUDENT="select * from student where Student_Id=?";
	
	public static final String VALIDATEINSTITUTE="select * from institute where Institute_Id=?";
	
	public static final String VALIDATEAPPROVE="select * from approval where Approval_Status=?";
	
	public static final String VALIDATEDELETE="select * from institute where Institute_Id=?";
	
	public static final String VALIDATEARTICLE="select * from article where Article_Id=?";
	
	public static final String VALIDATEPROFILE="select * from institute where Number_of_Course=?";
	
	public static final String VALIDATERESPONSE="select * from response where Response_Id=?";
	
	public static final String VALIDATEUPDATE="select * from student where Contact_Number=?";
	
	public static final String VALIDATEREQUEST="select * from request where Request_Id=?";
	
	public static final String VALIDATEFEEDBACK="select * from feedback where feedback_Id=?";
	
	
	public static final ResultMapper FETCHADMINOUTMAPER= new ResultMapper(){
		
		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			// TODO Auto-generated method stub
			String User_Id=rs.getString("User_Id");
			String Password=rs.getString("Password");
			
			Admin ad=new Admin(User_Id, Password);
			return ad;
		}
		
	};
	
	
	public static final ResultMapper FETCHINSTITUTEOUTMAPER= new ResultMapper(){
		
		@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			String Institute_Name=rs.getString("Institute_Name");
			String Password=rs.getString("Password");
			Institute i=new Institute(Institute_Name,Password);
			return i;
		}
		
	};
	
		public static final ResultMapper FETCHSTUDENTOUTMAPER= new ResultMapper(){
		
				@Override
		public Object mapRows(ResultSet rs) throws SQLException {
			
			Student s=new Student();
			s.setStudent_Id(rs.getString("Student_Id"));
			s.setPassword(rs.getString("Password"));
			return s;
		}
		
	};
	
	//Fetch Student
	
	   public static final ResultMapper FETCHSTUDENTDETAILSOUTMAPER= new ResultMapper(){
			@Override
			public Object mapRows(ResultSet rs) throws SQLException {
			
				String Student_Id=rs.getString(1);
				String Name=rs.getString(2);
				String Qualification=rs.getString(3);
				long Contact_Number=rs.getLong(4);
				String Address=rs.getString(5);
				String Email_Id=rs.getString(6);
				int User_Id=rs.getInt(7);
				String Password=rs.getString(8);
				Student s=new Student(Student_Id,Name,Qualification,Contact_Number,Address,Email_Id,User_Id,Password);
				return s;
			
			}
			
		  };
		  
		//Fetch Complaint
		  
	       public static final ResultMapper FETCHCOMPLAINTOUTMAPER= new ResultMapper(){
			
			@Override
			public Object mapRows(ResultSet rs) throws SQLException {
				int Complaint_Id=rs.getInt(1);
				String Message=rs.getString(2);
				String Student_Id=rs.getString(3);
				Complaint c=new Complaint(Complaint_Id,Message,Student_Id);
				return c;			}
			
		   };
		   
		   //Fetch Faculty
		   
		      public static final ResultMapper FETCHFACULTYOUTMAPER= new ResultMapper(){

				@Override
				public Object mapRows(ResultSet rs) throws SQLException {
					int Faculty_Id=rs.getInt(1);
					String Name=rs.getString(2);
					String Institute_Id=rs.getString(3);
					Faculty f= new Faculty(Faculty_Id,Name,Institute_Id);
					return f;				
					}
			  };
			  
			//Fetch Request
			  
		      public static final ResultMapper FETCHREQUESTOUTMAPER= new ResultMapper(){
				
				@Override
				public Object mapRows(ResultSet rs) throws SQLException {
					int Request_Id=rs.getInt(1);
					String Message=rs.getString(2);
					String Student_Id=rs.getString(3);
					Request r=new Request(Request_Id,Message,Student_Id);
					return r;				}
				
			  };
			  
			//Fetch Response
			  
		      public static final ResultMapper FETCHRESPONSEOUTMAPER= new ResultMapper(){
				
				@Override
				public Object mapRows(ResultSet rs) throws SQLException {
					
					int Response_Id=rs.getInt("Response_Id");
					String Message=rs.getString("Message");
					String Institute_Id=rs.getString("Institute_Id");
					String Student_Id=rs.getString("Student_Id");
					Response res=new Response(Response_Id,Message,Institute_Id,Student_Id);
					return res;
				}
				
			  };
			  
			  //Fetch Feedback
			  
			  public static final ResultMapper FETCHFEEDBACKOUTMAPER =new ResultMapper() {
				  
			@Override
				public Object mapRows(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					int Feedback_Id=rs.getInt("Feedback_Id");
					  String Feedback=rs.getString("Feedback");
					  String Student_Id=rs.getString("Student_Id");
					  Feedback fe=new Feedback(Feedback_Id,Feedback,Student_Id);
					return fe;
				}
			  };
			
			  public static final ResultMapper VALIDATEINSTITUTEDETAILSOUTMAPPER= new ResultMapper() {
				  
				  public Object mapRows(ResultSet rs) throws SQLException{
					  
					  String Institute_Id=rs.getString(1);
					  String Institute_Name=rs.getString(2);
					  String Affiliation_Date=rs.getString(3);
					  String Address=rs.getString(4);
					  int Number_of_Seats=rs.getInt(5);
					  int Number_of_Course=rs.getInt(6);
					  String Password=rs.getString(7);
					  Institute i=new Institute(Institute_Id, Institute_Name, Affiliation_Date, Address, Number_of_Seats, Number_of_Course, Password);
					return i;
				  }
			  };
			  public static final ResultMapper VALIDATESTUDENTDETAILSOUTMAPER= new ResultMapper(){
					@Override
					public Object mapRows(ResultSet rs) throws SQLException {
					
						String Student_Id=rs.getString(1);
						String Name=rs.getString(2);
						String Qualification=rs.getString(3);
						long Contact_Number=rs.getLong(4);
						String Address=rs.getString(5);
						String Email_Id=rs.getString(6);
						int User_Id=rs.getInt(7);
						Student s=new Student(Student_Id,Name,Qualification,Contact_Number,Address,Email_Id,User_Id);
						return s;
					
					}
					
				  };
				  
				  public static final ResultMapper VALIDATEAPPROVEOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  String Approval_Id=rs.getString(1);
						  String Approval_Status=rs.getString(2);
						  String Institute_Id=rs.getString(3);
						  String  Admin_ID=rs.getString(4);
						  Approval a=new Approval(Approval_Id,Approval_Status,Institute_Id,Admin_ID);
						return a;
					  }
				  };
				  
				  public static final ResultMapper VALIDATEDELETEOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  
						  String Institute_Id=rs.getString(1);
						 
						  Institute i=new Institute(Institute_Id);
						return i;
					  }
				  };
				  
				  public static final ResultMapper VALIDATEARTICLEOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  int Article_Id=rs.getInt(1);
						  Article a=new Article(Article_Id);
						return a;
					  }
				  };
				  
				  public static final ResultMapper VALIDATEPROFILEOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  
						  int Number_of_Course=rs.getInt(1);
						  Institute i=new Institute( Number_of_Course);
						return i;
					  }
				  };
				  
				  public static final ResultMapper VALIDATERESPONSEOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  
						  int Response_Id=rs.getInt(1);
						  Response r=new Response( Response_Id);
						return r;
					 
					 }
				  };
				  
				  public static final ResultMapper VALIDATEUPDATEOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  
						  long Contact_Number=rs.getLong(1);
						  Student s=new Student( Contact_Number);
						return s;
					  }
				  };
				  public static final ResultMapper VALIDATEREQUESTOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  
						  int Request_Id=rs.getInt(1);
						  Request r=new Request( Request_Id);
						return r;
					  }
				  };
				  public static final ResultMapper VALIDATEFEEDBACKOUTMAPPER= new ResultMapper() {
					  
					  public Object mapRows(ResultSet rs) throws SQLException{
						  
						  int Feedback_Id=rs.getInt(1);
						  Feedback r=new Feedback( Feedback_Id);
						return r;
					  }
				  };
				  
}
	
	
	
	
	
	
	
	
	
	