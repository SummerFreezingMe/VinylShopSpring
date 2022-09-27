package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.Vinyl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface VinylRepository extends JpaRepository<Vinyl,Long> {
    Page<Vinyl> findAllByOrderByVinylNameAsc(Pageable pageable);
    Iterable<Vinyl> findByGenre(String genre);
}

