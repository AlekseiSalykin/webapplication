package com.example.CarsApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "id_model")
    private Long modelId;
    @Column(name = "id_user")
    private Long userId;
    @Column(name = "number")
    private String number;

}
