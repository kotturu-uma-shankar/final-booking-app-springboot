package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.student;

	@Repository
	public interface student_reg_repo extends JpaRepository<student,Integer>{
}
