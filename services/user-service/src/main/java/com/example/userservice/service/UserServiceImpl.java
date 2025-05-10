package com.example.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.userservice.mapper.UserMapper;
import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  private final UserRepository jpaRepo;
  private final UserMapper mybatisMapper;

  public UserServiceImpl(UserRepository jpaRepo, UserMapper mybatisMapper) {
    this.jpaRepo = jpaRepo;
    this.mybatisMapper = mybatisMapper;
  }

  @Override
  public List<User> findAllUsers() {
    // 使用 JPA 撈
    List<User> viaJpa = jpaRepo.findAll();
    // 使用 MyBatis 撈
    List<User> viaMybatis = mybatisMapper.findAll();
    // 你可以回傳其中一個，也可以合併後回傳
    return viaJpa;
  }

  @Override
  @Transactional
  public User createUser(User u) {
    return jpaRepo.save(u);
  }
}
