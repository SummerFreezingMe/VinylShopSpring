package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LabelRepository extends JpaRepository<Label,Long> {
}
