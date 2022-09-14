package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.Vinyl;
import org.springframework.data.repository.CrudRepository;

public interface VinylRepository extends CrudRepository<Vinyl,Long> {
}
