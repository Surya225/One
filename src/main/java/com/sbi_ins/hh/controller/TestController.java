package com.sbi_ins.hh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sbi_ins.hh.entity.ABC;
import com.sbi_ins.hh.service.HHservice;

@RestController
@RequestMapping("person")
public class TestController {
	@Autowired
	private HHservice service;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
		public ResponseEntity<ABC>getAll() {
			
			RestTemplate resttemp=new RestTemplate();//data converting one application into another application we use resttemplate
			ResponseEntity resp=resttemp.getForEntity("http://localhost:8888/student/1", ABC.class);
			
			ABC abc= (ABC) resp.getBody();
			abc.setName("hello");
			ResponseEntity<ABC> response=new ResponseEntity(abc,HttpStatus.OK);
			//ResponseEntity<List<BasicDetails>> response1=new ResponseEntity<>(data,HttpStatus.OK);
			
			return response;
		}

	}

