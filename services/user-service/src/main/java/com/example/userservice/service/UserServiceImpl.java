package com.example.userservice.service;

import com.example.userservice.mapper.UserMapper;
import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

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
        return jpaRepo.findAll();
    }

    @Override
    @Transactional
    public User createUser(User u) {
        return jpaRepo.save(u);
    }
}
