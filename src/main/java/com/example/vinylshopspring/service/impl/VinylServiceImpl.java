package com.example.vinylshopspring.service.impl;

import com.example.vinylshopspring.domain.models.Vinyl;
import com.example.vinylshopspring.repos.VinylRepository;
import com.example.vinylshopspring.service.VinylService;
import org.springframework.stereotype.Service;

@Service
public class VinylServiceImpl implements VinylService {


    private final VinylRepository vinylRepository;

    public VinylServiceImpl(VinylRepository vinylRepository) {
        this.vinylRepository = vinylRepository;
    }

    public Iterable<Vinyl> findByGenre(String genre) {
        return vinylRepository.findByGenre(genre);
    }
}
