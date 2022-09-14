package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);
}