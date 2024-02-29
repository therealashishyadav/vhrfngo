package com.NgoLogin.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NgoLogin.entity.User;
import com.NgoLogin.repository.UserRepository;
import com.NgoLogin.service.UserService;

@Service
public class UserImpl implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Override
	public User addUser(User user) {

		User local = this.userRepository.findByUsername(user.getUsername());

		if (local != null) {
			System.out.println("User Already Present");
		}

		local = userRepository.save(user);

		return local;
	}

	@Override
	public List<User> getUsers() {

		return userRepository.findAll();

	}

	@Override
	public List<User> login(String username, String password) {

		return userRepository.findAll().stream()
				.filter(e -> (e.getUsername().equals(username)) && (e.getPassword().equals(password)))
				.collect(Collectors.toList());
	}

	@Override
	public boolean deleteUser(Long uId) {

		User deleteUser = this.userRepository.getById(uId);

		if (deleteUser != null) {
			userRepository.delete(deleteUser);
			return true;
		}
		return false;
	}

	@Override
	public User updateUser(Long uId, User user) {

		User updateUser = this.userRepository.getById(uId);

		if (updateUser != null) {
			updateUser.setEmail(user.getEmail());
			updateUser.setName(user.getName());
			updateUser.setPhone(user.getPhone());
			updateUser.setUsername(user.getUsername());
			updateUser.setPassword(user.getPassword());

			return this.userRepository.save(updateUser);
		} else {
			return null;
		}
	}

}
