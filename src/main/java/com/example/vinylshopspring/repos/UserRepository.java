package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String name);
}