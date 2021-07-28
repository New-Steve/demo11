package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.UserEntity;
import org.apache.tomcat.util.buf.UEncoder;

public interface UserService extends IService<UserEntity> {


    UserEntity loginIn(String name, String password);

}