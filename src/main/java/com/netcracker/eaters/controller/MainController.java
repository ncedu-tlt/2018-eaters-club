package com.netcracker.eaters.controller;

import com.netcracker.eaters.jdbc.DBUsers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class MainController {

    @GetMapping("/")
    public String greetingSubmit() {
        return "index";
    }

    @PostMapping("/index")
    public String selectForm(@ModelAttribute DBUsers selectAll) throws SQLException {
        selectAll.selectExampleH2();
        return "index";
    }
}