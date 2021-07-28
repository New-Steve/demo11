package com.example.demo.controller;

import com.alibaba.excel.EasyExcel;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
@Autowired
    private StudentService studentService;
@GetMapping("/red")
    public void read() {
    String fileName = "D:/text/1.jpg";
    EasyExcel.read(fileName, Student.class, new DemoDataListener(studentService)).sheet().doRead();

}
@GetMapping("/write")
public void write(){
    String fileName="D:/text";
    EasyExcel.write(fileName,Student.class).sheet("模板").doWrite(data());


}

    private List<Student> data() {
    List<Student> list1=studentService.list();
    return list1;
    }

}
