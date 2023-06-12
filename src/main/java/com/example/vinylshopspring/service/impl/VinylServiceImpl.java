package com.example.vinylshopspring.service.impl;

import com.example.vinylshopspring.domain.models.Vinyl;
import com.example.vinylshopspring.repos.VinylRepository;
import com.example.vinylshopspring.service.VinylService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VinylServiceImpl implements VinylService {


    private final VinylRepository vinylRepository;

    public VinylServiceImpl(VinylRepository vinylRepository) {
        this.vinylRepository = vinylRepository;
    }

    @Override
    public Iterable<Vinyl> findByGenre(String genre) {
        return vinylRepository.findByGenre(genre);
    }

    @Override
    public Vinyl findById(Long id) {
        return vinylRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Object findAllByOrderByVinylNameAsc(Pageable pageable) {
        return vinylRepository.findAllByOrderByVinylNameAsc(pageable);
    }
}
