package com.netcracker.eaters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
}