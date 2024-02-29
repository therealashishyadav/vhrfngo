package com.ExamPortal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExamPortal.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
