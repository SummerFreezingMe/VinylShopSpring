package com.example.vinylshopspring;

import com.example.vinylshopspring.domain.Vinyl;
import com.example.vinylshopspring.repos.VinylRepository;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class ShopController {
    @Autowired
    private VinylRepository vinylRepository;
    @GetMapping("/shop")
    public String shopController(@RequestParam(name = "genre", required = false, defaultValue = "all") String genre, Map<String, Object> model) {
        Iterable<Vinyl> vinyls;
        if (genre.equals("all")) {
            vinyls = vinylRepository.findAll();
        } else vinyls = vinylRepository.findByGenre(genre);
        model.put("vinyls", vinyls);
        return "shop";
    }

    @GetMapping("/shop/az")
    public String filterAToZ(Map<String, Object> model, Pageable pageable) {
        Iterable<Vinyl> vinyls = vinylRepository.findAllByOrderByVinylNameAsc(pageable);
        model.put("vinyls", vinyls);
        return "shop";
    }

    @GetMapping("/shop/pop")
    public String filterPop(Map<String, Object> model) {
        Iterable<Vinyl> vinyls = vinylRepository.findByGenre("Pop");
        model.put("vinyls", vinyls);
        return "shop";
    }

    @GetMapping("/shop/rock")
    public String filterRock(Map<String, Object> model) {
        Iterable<Vinyl> vinyls = vinylRepository.findByGenre("Rock");
        model.put("vinyls", vinyls);
        return "shop";
    }

    @GetMapping("/shop/hiphop")
    public String filterHipHop(Map<String, Object> model) {
        Iterable<Vinyl> vinyls = vinylRepository.findByGenre("Hip Hop");
        model.put("vinyls", vinyls);
        return "shop";
    }

    @GetMapping("/shop-single/{id}")
    public String shopSingle(Map<String, Object> model, @PathVariable("id") Long id) {
        Optional<Vinyl> vinyl = vinylRepository.findById(id);
        model.put("vinyl",vinyl.get());
        return "shop-single";
    }
/*  @GetMapping("/shop/add")
    public String addToCart(Map<String, Object> model){
       // Optional<Vinyl> chosen = vinylRepository.findByVinylsId(4);
     //  model.put("toCart",chosen);
        return "redirect:/cart";
    }*/

    public PaginatedBookResponse readBooks(Pageable pageable) {
        Page<Vinyl> vinyls = vinylRepository.findAll(pageable);
        return PaginatedBookResponse.builder()
                .numberOfItems(vinyls.getTotalElements()).numberOfPages(vinyls.getTotalPages())
                .vinylList(vinyls.getContent())
                .build();
    }

    @Data
    @Builder
    private static class PaginatedBookResponse {
        private List<Vinyl> vinylList;
        private Long numberOfItems = 10L;
        private int numberOfPages;
    }
}

