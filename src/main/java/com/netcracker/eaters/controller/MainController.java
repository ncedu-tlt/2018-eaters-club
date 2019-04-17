package com.netcracker.eaters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class MainController {

    @GetMapping("/")
    public String root(Model model) {
        return "index";
    }

    @GetMapping("/personalAccount")
    public String personalArea(Model model) {
        return "personalAccount";
    }
}