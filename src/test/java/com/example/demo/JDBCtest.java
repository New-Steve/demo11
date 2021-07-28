package com.example.demo;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtest {
    @Test
    public void jdbccall()throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/myemp";
        String username="root";
        String password="root";

        Connection conn= DriverManager.getConnection(url,username,password);
        System.out.println("连接成功！");
        System.out.println(conn);

    }
}
