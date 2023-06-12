package com.example.vinylshopspring.service.impl;

import com.example.vinylshopspring.domain.models.User;
import com.example.vinylshopspring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    public Object ordersAmount(User user) {
        Random r = new Random();
        // todo: fetching actual amount of orders from database
        return r.nextInt(5);
    }
}
