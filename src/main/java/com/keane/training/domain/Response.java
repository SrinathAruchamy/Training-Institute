package com.keane.training.domain;

public class Response {
	
	
	public Response(int response_Id, String message, String student_Id, String institute_Id) {
		super();
		Response_Id = response_Id;
		Message = message;
		Student_Id = student_Id;
		Institute_Id = institute_Id;
	}
	
	public Response(int response_Id2) {
		// TODO Auto-generated constructor stub
	}

	public int getResponse_Id() {
		return Response_Id;
	}
	public void setResponse_Id(int response_Id) {
		Response_Id = response_Id;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(String student_Id) {
		Student_Id = student_Id;
	}
	public String getInstitute_Id() {
		return Institute_Id;
	}
	public void setInstitute_Id(String institute_Id) {
		Institute_Id = institute_Id;
	}
	private int Response_Id;
	@Override
	public String toString() {
		return "Response [Response_Id=" + Response_Id + ", Message=" + Message + ", Student_Id=" + Student_Id
				+ ", Institute_Id=" + Institute_Id + "]";
	}
	private String Message;
	private String Student_Id;
	private String Institute_Id; 

}
