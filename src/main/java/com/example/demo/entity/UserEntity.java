package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class UserEntity implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String password;
}