package com.JWT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	private UserService
	
	@GetMapping("/user")
	public String getUser() {
		
		System.out.println("User");
		
		return "User";
		
	}
	
}
