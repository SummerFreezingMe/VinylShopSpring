package com.example.vinylshopspring;

import com.example.vinylshopspring.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserRepository ur;

    @GetMapping("/user")
    public String infoController(Map<String, Object> model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User) auth.getPrincipal();
        String username = principal.getUsername();
        com.example.vinylshopspring.domain.User user = ur.findByUsername(username);
        model.put("userName", username);
        model.put("orderCount", user.ordersAmount());
        return "user";
    }

}
