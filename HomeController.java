package com.example.assetmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";  // This maps to home.html in your templates folder
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";  // This maps to home.html
    }
}
