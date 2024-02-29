package com.DukanPe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DukanPe.Entity.User;
import com.DukanPe.UserRepo.UserRepositorty;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepositorty userRepository;

    // Endpoint to add a new user
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
