package com.example.jenkins.controller;

import com.example.jenkins.repository.BoardRepository;
import lombok.Cleanup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class TestController {

    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private DataSource dataSource;

    @GetMapping("/")
    public String testController() {
        return "Jenkins Test";
    }
    @GetMapping("/test")
    public String testController2() {
        return "<h1>우리집에 왜 왔니</h1>";
    }

    @GetMapping("/test2")
    public String testController3() {
        return "<h1>우리집에 왜 왔니 왜 왔니</h1>";
    }

    @GetMapping("/test3")
    public String testController4() {
        return boardRepository.test();
    }

    @GetMapping("/test4")
    public String testController5() throws SQLException {
        @Cleanup
        Connection con = dataSource.getConnection();

        return con.toString();
    }
}
