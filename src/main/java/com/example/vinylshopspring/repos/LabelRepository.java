package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.models.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label,Long> {
}
