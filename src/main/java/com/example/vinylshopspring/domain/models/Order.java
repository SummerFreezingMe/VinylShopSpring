package com.example.vinylshopspring.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {

    @Id
    private int orderId;


    @ElementCollection
    @Getter
    private List<Integer> vinylsId;

    private String shippingAddress;

    private Date placedAt;

}
