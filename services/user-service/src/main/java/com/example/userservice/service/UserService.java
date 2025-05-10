package com.example.userservice.service;

import java.util.List;

import com.example.userservice.model.User;

public interface UserService {
  List<User> findAllUsers();

  User createUser(User u);
}
