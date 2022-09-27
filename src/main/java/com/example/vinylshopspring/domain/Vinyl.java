package com.example.vinylshopspring.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="vinyls")
@NoArgsConstructor
public class Vinyl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vinyl_id;
    @Getter
    private String vinylName;
    @Getter
    private String description;
    @Getter
    private int price;
    private int yearPublished;
    @Getter
    private String genre;
    private int label;

}
