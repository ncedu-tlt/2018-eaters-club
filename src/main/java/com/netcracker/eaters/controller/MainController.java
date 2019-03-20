package com.netcracker.eaters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String loadIndex() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "loginPage";
    }

//    @PostMapping("/index")
//    public String selectForm(@ModelAttribute DBUsers selectAll) throws SQLException {
//        selectAll.selectExampleH2();
//        return "index";
//    }
}