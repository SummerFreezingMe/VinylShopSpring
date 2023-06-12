package com.example.vinylshopspring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ElementCollection;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDTO {

    private int orderId;

    @ElementCollection
    private List<Integer> vinylsId;

    private String shippingAddress;

    private Date placedAt;
}
