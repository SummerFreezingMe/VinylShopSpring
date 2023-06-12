package com.example.vinylshopspring.service;

import com.example.vinylshopspring.domain.models.Vinyl;
import org.springframework.data.domain.Pageable;

public interface VinylService {
    Iterable<Vinyl> findByGenre(String genre);

    Object findById(Long id);

    Object findAllByOrderByVinylNameAsc(Pageable pageable);
}
