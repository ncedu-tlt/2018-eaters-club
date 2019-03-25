package com.netcracker.eaters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

//    @GetMapping("/")
//    public String loadPage() {
//        return "index";
//    }

//    @GetMapping("/login")
//    public String login() {
//        return "loginPage";
//    }
//    public String login() {
//        return "loginPage";
//    }

    @GetMapping("/login")
    public String login() {
        return "loginPage";
    }
}