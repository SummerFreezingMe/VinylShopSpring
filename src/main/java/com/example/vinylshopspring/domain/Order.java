package com.example.vinylshopspring.domain;

import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@NoArgsConstructor
public class Order {

    @Id
    private int orderId;

    @ElementCollection
    private List<Integer> vinylsId;

    private String shippingAddress;

    private Date placedAt;
}
