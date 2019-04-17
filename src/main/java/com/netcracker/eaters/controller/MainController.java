package com.netcracker.eaters.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root(Model model) {
        return "index";
    }

    @GetMapping("/personalArea")
    public String personalArea(Model model) {
        return "personalArea";
    }
}