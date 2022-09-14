package com.example.vinylshopspring.domain;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="labels")
@NoArgsConstructor
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String location;

    public Label(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

}
