package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface OrderRepository extends Repository<Order,Long> {
}
