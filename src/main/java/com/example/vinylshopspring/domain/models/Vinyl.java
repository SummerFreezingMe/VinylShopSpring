package com.example.vinylshopspring.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="vinyls")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vinyl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vinyl_id;

    private String vinylName;

    private String description;

    private int price;

    private int yearPublished;

    private String genre;

    private String label;

}
