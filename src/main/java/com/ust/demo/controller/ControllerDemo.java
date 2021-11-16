package com.ust.demo.controller;

import java.net.http.HttpResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	@GetMapping("/app/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<>("Hi welcome to springboot app",HttpStatus.OK);
		
	}

}
