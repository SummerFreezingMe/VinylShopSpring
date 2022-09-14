package com.example.vinylshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.Random;

@Controller
public class UserController {
    @GetMapping("/user")
    public String infoController(Map<String, Object> model) {
        Random r = new Random();
        model.put("orderCount",r.nextInt(5));
        return "user";
    }

}
