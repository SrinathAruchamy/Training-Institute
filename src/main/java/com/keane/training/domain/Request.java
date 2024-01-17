package com.keane.training.domain;

public class Request {
	
	
	public Request(int request_Id, String message, String student_Id) {
		super();
		Request_Id = request_Id;
		Message = message;
		Student_Id = student_Id;
	}
	
	public Request(int request_Id2) {
		// TODO Auto-generated constructor stub
	}

	public int getRequest_Id() {
		return Request_Id;
	}
	public void setRequest_Id(int request_Id) {
		Request_Id = request_Id;
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
	
	private int Request_Id;
	@Override
	public String toString() {
		return "Request [Request_Id=" + Request_Id + ", Message=" + Message + ", Student_Id=" + Student_Id + "]";
	}

	private String Message;
	private String Student_Id;

}
