package com.example.vinylshopspring.repos;

import com.example.vinylshopspring.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
