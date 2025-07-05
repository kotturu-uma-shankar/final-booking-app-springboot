package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.student;
import com.example.demo.service.student_reg_repo;

@Controller

public class student_reg_controller {
	@Autowired
	student_reg_repo repo;
	
	@RequestMapping("Student")
	public String view() {
		
		return  "student_register";
	}
	
	
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String reg(student student) {
	
		repo.save(student);
		return " Student registration Successfull";
	
	}
	
	
	
	

}
