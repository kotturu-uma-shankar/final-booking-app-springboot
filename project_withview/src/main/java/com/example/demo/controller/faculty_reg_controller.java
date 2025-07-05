package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.faculty;
import com.example.demo.service.faculty_reg_repo;

@Controller
public class faculty_reg_controller {
	@Autowired
	faculty_reg_repo frepo;
	
	@RequestMapping("faculty")
	public String facultyreg() {
		return "faculty_register";
	}
	
	@RequestMapping("/addFaculty")
	@ResponseBody
	public String addfaculty(faculty faculty) {
		frepo.save(faculty);

		return"Faculty registered successfully";
	}

}
