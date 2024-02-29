package com.NgoLogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.NgoLogin.entity.User;
import com.NgoLogin.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	public UserService userService;

	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("login/{username}/{password}")
	public List<User> login(@PathVariable("username") String username, @PathVariable("password") String password) {
		List<User> local = userService.login(username, password);
		return local;
	}

	@DeleteMapping("/{uId}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long uId) {
		boolean deleted = userService.deleteUser(uId);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/{uId}")
	public User updateUser(@PathVariable("uId") Long uId, @RequestBody User user) {
		User updateUser = this.userService.updateUser(uId, user);
		return updateUser;
	}

}
