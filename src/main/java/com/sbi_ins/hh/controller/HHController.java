package com.sbi_ins.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbi_ins.hh.entity.PersonalDetilsEntity;
import com.sbi_ins.hh.service.HHservice;


@RestController
@RequestMapping("persondetails")
public class HHController {
	
	@Autowired
	private HHservice service;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public ResponseEntity<List<PersonalDetilsEntity>> getAll(){
		
		List<PersonalDetilsEntity> data=service.getAll();
		ResponseEntity<List<PersonalDetilsEntity>> response=new ResponseEntity<>(data,HttpStatus.OK);
		return response;
		

}
	}
