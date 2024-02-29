package com.ExamPortal.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.ExamPortal.Services.UserService;
import com.ExamPortal.entity.User;
import com.ExamPortal.entity.UserRole;
import com.ExamPortal.repo.RoleRepo;
import com.ExamPortal.repo.UserRepo;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private RoleRepo roleRepo;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {

		User local = this.userRepo.findByUsername(user.getUsername());
		if (local != null) {
			System.out.println("User Present");
			throw new Exception("User already Present");
		}else {
			for(UserRole ur : userRoles) {
				roleRepo.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepo.save(user);
		}

		return local;
	}

}
