package com.example.vinylshopspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class CatalogController {

    @GetMapping("/contact")
    public String contactController(Map<String, Object> model) {
        return "contact";
    }
}