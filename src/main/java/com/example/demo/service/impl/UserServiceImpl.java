package com.example.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.UserEntity;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl  extends ServiceImpl<UserDao, UserEntity> implements UserService{

    //将DAO注入Service层
    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity loginIn(String name, String password) {
        return userDao.getInfo(name,password);
    }

}