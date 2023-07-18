package com.example.CarsApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usr")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "username")
    @Size(min = 1, max = 20, message = "Username should be from 1 to 20 chars")
    private String username;
    @Column(name = "password")
    @Size(min = 1, max = 20, message = "Password should be from 1 to 20 chars")
    private String password;
    @Column(name = "name")
    @Size(min = 2, max = 20, message = "Name should be from 2 to 20 chars")
    private String name;
}
