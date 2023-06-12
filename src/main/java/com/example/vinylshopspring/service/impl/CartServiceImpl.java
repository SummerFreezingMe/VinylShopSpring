package com.example.vinylshopspring.service.impl;

import com.example.vinylshopspring.domain.models.Vinyl;
import com.example.vinylshopspring.repos.VinylRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CartServiceImpl {

    private List<Vinyl> vinylsCart;
    private final VinylRepository vinylRepository;

    public CartServiceImpl(VinylRepository vinylRepository) {
        this.vinylRepository = vinylRepository;
    }

    public List<Vinyl> addItem(Long id) {
        if (vinylsCart == null) {
            vinylsCart = new ArrayList<>();
        }
        Optional<Vinyl> vinyl = vinylRepository.findById(id);
        vinylsCart.add(vinyl.orElse(null));
        return vinylsCart;
    }

    public List<Vinyl> deleteItem(Long id) {
        vinylsCart.removeIf(v -> Objects.equals(v.getVinyl_id(), id));
        return vinylsCart;
    }

    public List<Vinyl> getCart() {
        if (vinylsCart == null) {
            vinylsCart = new ArrayList<>();
        }
        return vinylsCart;
    }
}
