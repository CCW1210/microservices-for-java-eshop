package com.example.userservice.mapper;

import com.example.userservice.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT id, name, email FROM users")
    List<User> findAll();
}
