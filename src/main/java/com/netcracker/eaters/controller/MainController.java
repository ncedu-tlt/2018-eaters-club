package com.netcracker.eaters.controller;

import com.netcracker.eaters.jdbc.DBUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class MainController {

    @GetMapping("/")
    public String loadPage() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "loginPage";
    }

    @PostMapping("/index")
    public String selectForm(@ModelAttribute DBUsers selectAll) throws SQLException {
        selectAll.selectExampleH2();
        return "index";
    }
}