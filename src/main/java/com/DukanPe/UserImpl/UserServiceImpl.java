package com.DukanPe.UserImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DukanPe.Entity.User;
import com.DukanPe.UserRepo.UserRepositorty;
import com.DukanPe.UserService.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserService userService;

	@Override
	public User createUser(User user) {

		return userService.save(user);
	}

}
