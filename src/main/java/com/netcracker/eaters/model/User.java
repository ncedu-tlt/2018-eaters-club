package com.netcracker.eaters.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column
    private String email;

    @Column
    private String password;
//    private String firstName;
//    private String lastName;

    @Transient
    private String passwordConfirm;

    @Column
    private String regDate;

    @ManyToMany
    private Set<Role> roles;

    public void setRegDate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        this.regDate = simpleDateFormat.format(date);
    }
}
