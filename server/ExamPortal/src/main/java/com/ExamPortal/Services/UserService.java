package com.ExamPortal.Services;

import java.util.Set;

import com.ExamPortal.entity.User;
import com.ExamPortal.entity.UserRole;

public interface UserService {

	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

	
}
