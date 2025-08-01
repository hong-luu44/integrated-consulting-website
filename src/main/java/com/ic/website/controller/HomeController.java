package com.ic.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("companyName", "Integrated Consulting");
        model.addAttribute("tagline", "Building Professional Websites for All Industries");
        return "index";
    }
}
