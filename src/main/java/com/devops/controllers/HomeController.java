package com.devops.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {
	
	@Autowired
	Environment env;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> index(){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Welcome to the home page!" + env.getProperty("application-name"));
	}

}
