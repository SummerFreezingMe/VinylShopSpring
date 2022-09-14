package com.example.vinylshopspring.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="vinyls")
@NoArgsConstructor
public class Vinyl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vinyl_id;
    private String vinyl_name;
    private String description;
    private int price;
    private int yearPublished;
    private String genre;
    private int label;

}
