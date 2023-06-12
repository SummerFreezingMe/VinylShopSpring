package com.example.vinylshopspring;

import com.example.vinylshopspring.domain.models.Vinyl;
import com.example.vinylshopspring.repos.VinylRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


@Controller
public class CartController {
    @Autowired
    private VinylRepository vinylRepository;
    private List<Vinyl> vinylsCart;

    @GetMapping("/cart/{id}")
    public String cartController(Map<String, Object> model, @PathVariable("id") Long id) {
        return addItem(model, id);
    }


    @GetMapping("/cart")
    public String cartController(Map<String, Object> model) {
        model.put("vinyl", vinylsCart);
        return "cart";
    }

    @GetMapping("shop-single/cart/{id}")
    public String redirectToCart(Map<String, Object> model, @PathVariable("id") Long id) {
        return addItem(model, id);
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(Map<String, Object> model, @PathVariable("id") Long id) {
        vinylsCart.removeIf(v -> Objects.equals(v.getVinyl_id(), id));

        model.put("vinyl", vinylsCart);
        return "redirect:/cart";
    }

    @GetMapping("/congratulation")
    public String infoController(Map<String, Object> model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User) auth.getPrincipal();
        String username = principal.getUsername();
        model.put("userName", username);
        return "congratulation";
    }
    private String addItem(Map<String, Object> model, @PathVariable("id") Long id) {
        if (vinylsCart == null) {
            vinylsCart = new ArrayList<>();
        }
        Optional<Vinyl> vinyl = vinylRepository.findById(id);
        vinylsCart.add(vinyl.orElse(null));
        model.put("vinyl", vinylsCart);
        return "redirect:/cart";
    }

}
