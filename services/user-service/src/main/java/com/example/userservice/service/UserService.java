package com.example.userservice.service;

import com.example.userservice.model.User;
import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    User createUser(User u);
}
