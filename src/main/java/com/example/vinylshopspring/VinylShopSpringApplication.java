package com.example.vinylshopspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.example.vinylshopspring.domain")
@EnableJpaRepositories("com.example.vinylshopspring.repos")
@SpringBootApplication()
public class VinylShopSpringApplication {

    public static void main(String[] args) {
        
        SpringApplication.run(VinylShopSpringApplication.class, args);
    }

}
