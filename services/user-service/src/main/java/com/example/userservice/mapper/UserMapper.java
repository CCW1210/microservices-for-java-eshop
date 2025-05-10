package com.example.userservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.example.userservice.model.User;

@Mapper
public interface UserMapper {
  @Select("SELECT * FROM users WHERE id = #{id}")
  User findById(Long id);

  @Select("SELECT * FROM users")
  List<User> findAll();

  @Insert("INSERT INTO users (username, email) VALUES (#{username}, #{email})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void insert(User user);

  @Update("UPDATE users SET username = #{username}, email = #{email} WHERE id = #{id}")
  void update(User user);

  @Delete("DELETE FROM users WHERE id = #{id}")
  void delete(Long id);
}
