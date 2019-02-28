package com.netcracker.eaters.controller;

import com.netcracker.eaters.jdbc.Greeting;
import com.netcracker.eaters.jdbc.SimpleExample;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MainController {

    @GetMapping(value = {""} )
    public String greetingForm(Model modelDB) {
        modelDB.addAttribute("simpleExample", new SimpleExample());
        return "index";
    }

    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute SimpleExample greeting) {
        return "index";
    }
}