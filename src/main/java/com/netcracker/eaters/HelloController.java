package com.netcracker.eaters;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private static List<Developer> developers = new ArrayList<>();

    static {
        developers.add(new Developer("Vlad", "Efremenko"));
        developers.add(new Developer("Oleg", "Shalyakin"));
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Greetings to Eaters Club developers!");

        return "index";
    }

    @RequestMapping(value = { "/developers" }, method = RequestMethod.GET)
    public String personList(Model model) {

        model.addAttribute("devs", developers);

        return "developers";
    }
}