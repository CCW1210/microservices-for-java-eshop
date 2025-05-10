package com.example.userservice.mapper;

import com.example.userservice.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@MybatisTest
class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    void testFindAllReturnsEmptyInitially() {
        List<User> users = mapper.findAll();
        assertThat(users).isEmpty();
    }
}
