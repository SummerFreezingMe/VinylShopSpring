package com.example.vinylshopspring.controller;

import com.example.vinylshopspring.domain.models.User;
import com.example.vinylshopspring.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String infoController(Map<String, Object> model) {
        User user = userService.getCurrentUser();
        model.put("userName", user);
        model.put("orderCount", userService.ordersAmount(user));
        return "user";
    }

}
