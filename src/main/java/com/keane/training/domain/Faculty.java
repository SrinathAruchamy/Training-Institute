package com.keane.training.domain;

public class Faculty {
	
	
	public Faculty(int faculty_Id, String name, String institute_Id) {
		super();
		Faculty_Id = faculty_Id;
		Name = name;
		Institute_Id = institute_Id;
	}
	
	
	public int getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(int faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getInstitute_Id() {
		return Institute_Id;
	}
	public void setInstitute_Id(String institute_Id) {
		Institute_Id = institute_Id;
	}

	private int Faculty_Id;
	@Override
	public String toString() {
		return "Faculty [Faculty_Id=" + Faculty_Id + ", Name=" + Name + ", Institute_Id=" + Institute_Id + "]";
	}

	private String Name;
	private String Institute_Id;

}
