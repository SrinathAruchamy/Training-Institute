package com.keane.training.domain;

public class Delete {
	
	String Institute_Id;

	@Override
	public String toString() {
		return "Delete [Institute_Id=" + Institute_Id + "]";
	}

	public String getInstitute_Id() {
		return Institute_Id;
	}

	public void setInstitute_Id(String institute_Id) {
		Institute_Id = institute_Id;
	}

	public Delete(String institute_Id) {
		super();
		Institute_Id = institute_Id;
	}

	public Delete() {
		// TODO Auto-generated constructor stub
	}

	public Delete(String institute_Id2, String institute_Name) {
		// TODO Auto-generated constructor stub
	}

}
