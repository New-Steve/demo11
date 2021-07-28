package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService extends IService<Student> {


    List<Student> list();

}
