package com.example.demo.entity;


import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;

@TableName("excel")
@Data
public class Student {

@TableId/*设置主键*/
@ExcelIgnore/*不将此字段转成excel格式*/
    private String id;


    @ExcelProperty(value = "姓名")
    private String name;
    @ExcelProperty(value = "性别")
    private Integer gender;
    @ExcelProperty(value = "年级")
    private String grade;
    @ExcelProperty(value = "分数")
    private Integer mark;


    @ExcelIgnore
    private Integer delFlag;


}
