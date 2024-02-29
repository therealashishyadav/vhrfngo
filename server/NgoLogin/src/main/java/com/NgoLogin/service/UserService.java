package com.NgoLogin.service;

import java.util.List;

import com.NgoLogin.entity.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getUsers();

	public List<User> login(String username, String password);

	public boolean deleteUser(Long uId);

	public User updateUser(Long uId, User user);

}
