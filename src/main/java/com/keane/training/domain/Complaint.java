package com.keane.training.domain;

public class Complaint {
	
	
	public Complaint(int complaint_Id, String message, String student_Id) {
		super();
		Complaint_Id = complaint_Id;
		Message = message;
		Student_Id = student_Id;
	}
	
	public Complaint(int complaint_Id2, String message2, int student_Id2) {
		// TODO Auto-generated constructor stub
	}

	public int getComplaint_Id() {
		return Complaint_Id;
	}
	public void setComplaint_Id(int complaint_Id) {
		Complaint_Id = complaint_Id;
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
	
	private int Complaint_Id;
	@Override
	public String toString() {
		return "Complaint [Complaint_Id=" + Complaint_Id + ", Message=" + Message + ", Student_Id=" + Student_Id + "]";
	}

	private String Message;
	private String Student_Id;

}
