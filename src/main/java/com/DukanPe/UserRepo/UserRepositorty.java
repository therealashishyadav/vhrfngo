package com.DukanPe.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DukanPe.Entity.User;

public interface UserRepositorty extends JpaRepository<User, Long> {

}
