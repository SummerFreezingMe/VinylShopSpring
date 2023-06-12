package com.example.vinylshopspring.service.impl;

import com.example.vinylshopspring.domain.models.User;
import com.example.vinylshopspring.repos.UserRepository;
import com.example.vinylshopspring.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Object ordersAmount(User user) {
        Random r = new Random();
        // todo: fetching actual amount of orders from database
        return r.nextInt(5);
    }

    @Override
    public User getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User) auth.getPrincipal();
        String username = principal.getUsername();
       return userRepository.findByUsername(username);
    }
}
