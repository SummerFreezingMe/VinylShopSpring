package com.example.vinylshopspring.domain.dto;

import com.example.vinylshopspring.domain.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private Long id;

    private String username;

    private String email;

    private boolean active;

    private Set<Role> roles;


}