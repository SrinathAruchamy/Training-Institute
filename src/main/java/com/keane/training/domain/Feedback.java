package com.keane.training.domain;

public class Feedback {
	
	
	public Feedback(int feedback_Id, String feedback, String student_ID) {
		super();
		Feedback_Id = feedback_Id;
		Feedback = feedback;
		Student_ID = student_ID;
	}
	
	public Feedback(int feedback_Id2) {
		// TODO Auto-generated constructor stub
	}

	public int getFeedback_Id() {
		return Feedback_Id;
	}
	public void setFeedback_Id(int feedback_Id) {
		Feedback_Id = feedback_Id;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	public String getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(String student_ID) {
		Student_ID = student_ID;
	}
	private int Feedback_Id;
	@Override
	public String toString() {
		return "Feedback [Feedback_Id=" + Feedback_Id + ", Feedback=" + Feedback + ", Student_ID=" + Student_ID + "]";
	}
	private String Feedback;
	private String Student_ID;

}
