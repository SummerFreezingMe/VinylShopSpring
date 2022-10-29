package com.example.vinylshopspring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@NoArgsConstructor
public class Order {

    @Id
    private int orderId;


    @ElementCollection
    @Getter
    private List<Integer> vinylsId;

    private String shippingAddress;

    private Date placedAt;


    @Transient
    public Double getTotalOrderPrice() {
        double sum = 0D;
        List<Integer> orderProducts = getVinylsId();
        for (Integer id :orderProducts) {
            //todo : we either store IDs or vinyls
        }
        return sum;
    }

    @Transient
    public int getNumberOfProducts() {
        return this.vinylsId.size();
    }
}
