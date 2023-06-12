package com.example.vinylshopspring.controller;

import com.example.vinylshopspring.service.impl.VinylServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ShopController {
    private final VinylServiceImpl vinylService;

    public ShopController(VinylServiceImpl vinylService) {
        this.vinylService = vinylService;
    }

    @GetMapping("/shop")
    public String shopController(@RequestParam(name = "genre", required = false, defaultValue = "all") String genre, Map<String, Object> model) {
        model.put("vinyls", vinylService.findByGenre(genre));
        return "shop";
    }

    @GetMapping("/shop/az")
    public String filterAToZ(Map<String, Object> model, Pageable pageable) {
        model.put("vinyls", vinylService.findAllByOrderByVinylNameAsc(pageable));
        return "shop";
    }

    @GetMapping("/shop-single/{id}")
    public String shopSingle(Map<String, Object> model, @PathVariable("id") Long id) {
        model.put("vinyl",vinylService.findById(id));
        return "shop-single";
    }
/*  @GetMapping("/shop/add")
    public String addToCart(Map<String, Object> model){
       // Optional<Vinyl> chosen = vinylRepository.findByVinylsId(4);
     //  model.put("toCart",chosen);
        return "redirect:/cart";
    }*/

//    public PaginatedBookResponse readBooks(Pageable pageable) {
//        Page<Vinyl> vinyls = vinylRepository.findAll(pageable);
//        return PaginatedBookResponse.builder()
//                .numberOfItems(vinyls.getTotalElements()).numberOfPages(vinyls.getTotalPages())
//                .vinylList(vinyls.getContent())
//                .build();
//    }
//
//    @Data
//    @Builder
//    private static class PaginatedBookResponse {
//        private List<Vinyl> vinylList;
//        private Long numberOfItems = 10L;
//        private int numberOfPages;
//    }
}

