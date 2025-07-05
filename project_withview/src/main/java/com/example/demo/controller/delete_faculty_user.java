package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.faculty;
import com.example.demo.model.student;
import com.example.demo.service.faculty_reg_repo;
import com.example.demo.service.student_reg_repo;

@Controller
public class delete_faculty_user {
	
	@Autowired
	student_reg_repo repo;
	@Autowired
	faculty_reg_repo frepo;
	
	
	@RequestMapping("/")
	public String view() {
		
		return  "delete_student_faculty";
	}
	
	
	
	
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public String deleteStudent(@RequestParam("Student_RegdNo")int Student_RegdNo) {
		student s=repo.getOne(Student_RegdNo);
		repo.delete(s);
		return "Student deleted successfully";
		
	}
	
	
	@RequestMapping("/deletefaculty")
	@ResponseBody
	public String deletefaculty(@RequestParam("Faculty_Id")int Faculty_Id) {
		faculty p=frepo.getOne(Faculty_Id);
		frepo.delete(p);
		return "faculty deleted successfully";
		
	}
	
	
	
	
	

}
