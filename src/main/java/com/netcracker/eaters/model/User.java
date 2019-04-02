package com.netcracker.eaters.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String email;

    @Column
    private String password;
//    private String firstName;
//    private String lastName;

    @Transient
    private String passwordConfirm;
    private String regDate;

    @ManyToMany
    private Set<Role> roles;
}
