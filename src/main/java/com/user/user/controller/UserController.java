package com.user.user.controller;

import org.springframework.web.bind.annotation.RestController;

import com.user.user.entity.User;
import com.user.user.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    
    @GetMapping("")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
    
}
