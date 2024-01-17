package com.keane.training.domain;

public class Institute {

	
	
	public Institute(String institute_Id, String institute_Name, String affiliation_Date, String address,
			int number_of_Seats, int number_of_Course, String password) {
		super();
		Institute_Id = institute_Id;
		Institute_Name = institute_Name;
		Affiliation_Date = affiliation_Date;
		Address = address;
		Number_of_Seats = number_of_Seats;
		Number_of_Course = number_of_Course;
		Password = password;
	}
	
	public Institute(String institute_Name2, String password2) {
		// TODO Auto-generated constructor stub
	}

	public Institute(String institute_Id2) {
		// TODO Auto-generated constructor stub
	}


	
	public Institute(String institute_Id2, int number_Of_Course2) {
		// TODO Auto-generated constructor stub
	}

	public Institute(int number_of_Course2) {
		// TODO Auto-generated constructor stub
	}

	public String getInstitute_Id() {
		return Institute_Id;
	}
	public void setInstitute_Id(String institute_Id) {
		Institute_Id = institute_Id;
	}
	public String getInstitute_Name() {
		return Institute_Name;
	}
	public void setInstitute_Name(String institute_Name) {
		Institute_Name = institute_Name;
	}
	public String getAffiliation_Date() {
		return Affiliation_Date;
	}
	public void setAffiliation_Date(String affiliation_Date) {
		Affiliation_Date = affiliation_Date;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getNumber_of_Seats() {
		return Number_of_Seats;
	}
	public void setNumber_of_Seats(int number_of_Seats) {
		Number_of_Seats = number_of_Seats;
	}
	public int getNumber_of_Course() {
		return Number_of_Course;
	}
	public void setNumber_of_Course(int number_of_Course) {
		Number_of_Course = number_of_Course;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	@Override
	public String toString() {
		return "Institute [Institute_Id=" + Institute_Id + ", Institute_Name=" + Institute_Name + ", Affiliation_Date="
				+ Affiliation_Date + ", Address=" + Address + ", Number_of_Seats=" + Number_of_Seats
				+ ", Number_of_Course=" + Number_of_Course + ", Password=" + Password + "]";
	}

	private String Institute_Id;
	private String Institute_Name;
    private String Affiliation_Date;
	private String Address;
	private int Number_of_Seats;
	private int Number_of_Course;
	private String Password;
}
