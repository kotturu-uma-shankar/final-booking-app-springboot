package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	
	@Id
	private int Student_RegdNo;
	private String Student_Dept;
	private String student_Name;
	private String student_Email;
	private String student_No;
	private String student_Branch;
	private String password;
	public int getStudent_RegdNo() {
		return Student_RegdNo;
	}
	public void setStudent_RegdNo(int student_RegdNo) {
		Student_RegdNo = student_RegdNo;
	}
	public String getStudent_Dept() {
		return Student_Dept;
	}
	public void setStudent_Dept(String student_Dept) {
		Student_Dept = student_Dept;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_Email() {
		return student_Email;
	}
	public void setStudent_Email(String student_Email) {
		this.student_Email = student_Email;
	}
	public String getStudent_No() {
		return student_No;
	}
	public void setStudent_No(String student_No) {
		this.student_No = student_No;
	}
	public String getStudent_Branch() {
		return student_Branch;
	}
	public void setStudent_Branch(String student_Branch) {
		this.student_Branch = student_Branch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "student [Student_RegdNo=" + Student_RegdNo + ", Student_Dept=" + Student_Dept + ", student_Name="
				+ student_Name + ", student_Email=" + student_Email + ", student_No=" + student_No + ", student_Branch="
				+ student_Branch + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
