package com.keane.training.domain;

public class Student {
	
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getStudent_Id() {
		return Student_Id;
	}
	public void setStudent_Id(String student_Id) {
		Student_Id = student_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public long getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(long contact_Number) {
		Contact_Number = contact_Number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("Student [Student_Id=");
		builder.append(Student_Id);
		builder.append(", Name=");
		builder.append(Name);
		builder.append(", Qualification=" );
		builder.append(Qualification);
		builder.append(", Contact_Number=");
		builder.append(Contact_Number);
		builder.append(", Address=");
		builder.append(Address);
		builder.append(", Email_Id=");
		builder.append(Email_Id);
		builder.append(", User_Id=");
		builder.append(User_Id);
		builder.append(", Password=");
		builder.append(Password);
		builder.append("]");
		return builder.toString();
	}
	
	private String Student_Id;
	public Student(String student_Id, String name, String qualification, long contact_Number, String address,
			String email_Id, int user_Id, String password) {
		super();
		Student_Id = student_Id;
		Name = name;
		Qualification = qualification;
		Contact_Number = contact_Number;
		Address = address;
		Email_Id = email_Id;
		User_Id = user_Id;
		Password = password;
	}

	public Student(String student_Id2, Long contact_Number2) {
		// TODO Auto-generated constructor stub
	}

	public Student(String student_Id2, String name2, String qualification2, long contact_Number2, String address2,
			String email_Id2, int user_Id2) {
		// TODO Auto-generated constructor stub
	}

	public Student(long contact_Number2) {
		// TODO Auto-generated constructor stub
	}

	private String Name;
	private String Qualification;
	private long Contact_Number;
	private String Address;
	private String Email_Id;
	private int User_Id;
	private String Password;
	

}
