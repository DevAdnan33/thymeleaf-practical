package com.thymeleafpractical.thymeleaf_practical.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping(value = "/about.html")
    public String about(Model model) {
        model.addAttribute("name", "Adnan");
        model.addAttribute("date", new Date()).toString();
        return "about";
    }
}
