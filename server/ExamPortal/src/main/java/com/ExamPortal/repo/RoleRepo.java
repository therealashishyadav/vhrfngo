package com.ExamPortal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExamPortal.entity.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
