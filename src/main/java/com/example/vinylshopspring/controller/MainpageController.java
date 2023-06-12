package com.example.vinylshopspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainpageController {

    @GetMapping("/index")
    public String mainpageController(Map<String, Object> model) {
        return "index";
    }
}
