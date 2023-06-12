package com.example.vinylshopspring.controller;

import com.example.vinylshopspring.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainpageController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public String mainpageController(Map<String, Object> model) {
       // Iterable<User> messages = userRepository.findAll();
      //  model.put("users",messages);
        return "index";
    }
}
