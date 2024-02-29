package com.ExamPortal.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ExamPortal.Services.UserService;
import com.ExamPortal.entity.Role;
import com.ExamPortal.entity.User;
import com.ExamPortal.entity.UserRole;

@RestController

public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		
		Set<UserRole> roles = new HashSet<>();
		
		Role role = new Role();
		role.setRoleId(45L);
		role.setRoleName("Ashish");
		roles.add(null)
	}

}
