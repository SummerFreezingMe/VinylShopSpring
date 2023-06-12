package com.example.vinylshopspring.domain.models;

import com.example.vinylshopspring.domain.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Random;
import java.util.Set;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;


    public User(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    public Object ordersAmount() {
        Random r = new Random();
        // todo: fetching actual amount of orders from database
        return r.nextInt(5);
    }
}