package com.example.vinylshopspring;

import com.example.vinylshopspring.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
@Controller
public class InfoController {
    @GetMapping("/about")
    public String infoController(Map<String, Object> model) {
        return "about";
    }
}