package com.example.vinylshopspring.controller;

import com.example.vinylshopspring.service.impl.CartServiceImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


@Controller
public class CartController {
    private final CartServiceImpl cartService;

    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/cart/{id}")
    public String cartController(Map<String, Object> model, @PathVariable("id") Long id) {
        return addItem(model, id);
    }


    @GetMapping("/cart")
    public String cartController(Map<String, Object> model) {
        model.put("vinyl",cartService.getCart());
        return "cart";
    }

    @GetMapping("shop-single/cart/{id}")
    public String redirectToCart(Map<String, Object> model, @PathVariable("id") Long id) {
        return addItem(model, id);
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(Map<String, Object> model, @PathVariable("id") Long id) {
        model.put("vinyl", cartService.deleteItem(id));
        return "redirect:/cart";
    }

    @GetMapping("/congratulation")
    public String infoController(Map<String, Object> model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User) auth.getPrincipal();
        String username = principal.getUsername();
        model.put("userName", username);
        //todo: extract this method too
        return "congratulation";
    }
    private String addItem(Map<String, Object> model, @PathVariable("id") Long id) {
        model.put("vinyl", cartService.addItem(id));
        return "redirect:/cart";
    }

}
