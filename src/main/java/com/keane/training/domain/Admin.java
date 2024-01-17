package com.keane.training.domain;

public class Admin {
	
	
	public Admin(String user_Id, String name, String password) {
		super();
		User_Id = user_Id;
		Name = name;
		Password = password;
	}
	
	public Admin(String user_Id2, String password2) {
		// TODO Auto-generated constructor stub
	}

	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	private String User_Id;
	@Override
	public String toString() {
		return "Admin [User_Id=" + User_Id + ", Name=" + Name + ", Password=" + Password + "]";
	}
	private String Name;
	private String Password;

}
