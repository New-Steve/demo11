package com.example.demo;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class TestApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        UserEntity  userEntity = userService.loginIn("张三","123456");
        System.out.println("该用户ID为：");
        System.out.println(userEntity.getId());
    }
}