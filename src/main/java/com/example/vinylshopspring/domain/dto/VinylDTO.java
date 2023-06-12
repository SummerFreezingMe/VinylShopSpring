package com.example.vinylshopspring.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VinylDTO {

    private Long vinyl_id;

    private String vinylName;

    private String description;

    private int price;

    private int yearPublished;

    private String genre;

    private String label;

}
