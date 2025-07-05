package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class faculty {
	
	@Id
	public int Faculty_Id;
	public String Faculty_Dept;
	public String Faculty_Name;
	public String Faculty_Email;
	public String Faculty_No;
	public String password;
	public int getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(int faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public String getFaculty_Dept() {
		return Faculty_Dept;
	}
	public void setFaculty_Dept(String faculty_Dept) {
		Faculty_Dept = faculty_Dept;
	}
	public String getFaculty_Name() {
		return Faculty_Name;
	}
	public void setFaculty_Name(String faculty_Name) {
		Faculty_Name = faculty_Name;
	}
	public String getFaculty_Email() {
		return Faculty_Email;
	}
	public void setFaculty_Email(String faculty_Email) {
		Faculty_Email = faculty_Email;
	}
	public String getFaculty_No() {
		return Faculty_No;
	}
	public void setFaculty_No(String faculty_No) {
		Faculty_No = faculty_No;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "faculty [Faculty_Id=" + Faculty_Id + ", Faculty_Dept=" + Faculty_Dept + ", Faculty_Name=" + Faculty_Name
				+ ", Faculty_Email=" + Faculty_Email + ", Faculty_No=" + Faculty_No + ", password=" + password + "]";
	}
	
	
	
	
	
}
