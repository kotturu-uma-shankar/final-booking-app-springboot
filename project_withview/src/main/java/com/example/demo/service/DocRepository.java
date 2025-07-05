package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Doc;

public interface DocRepository  extends JpaRepository<Doc,Integer>{

}
