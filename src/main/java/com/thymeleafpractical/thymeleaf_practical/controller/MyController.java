package com.thymeleafpractical.thymeleaf_practical.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping(value = "/about.html")
    public String about(Model model) {
        model.addAttribute("name", "Adnan");
        model.addAttribute("date", new Date()).toString();
        return "about";
    }

    @GetMapping("/example-loop.html")
    public String itrateHandler(Model model) {
        List<String> names = List.of("Adnan", "Irfan", "Nauman", "Khalid");
        model.addAttribute("names", names);
        return "example-loop";
    }
}
