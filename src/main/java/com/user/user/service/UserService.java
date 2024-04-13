package com.user.user.service;

import java.util.List;

import com.user.user.entity.User;

public interface UserService {
    List<User> getAll();
    User create(User user);
}
