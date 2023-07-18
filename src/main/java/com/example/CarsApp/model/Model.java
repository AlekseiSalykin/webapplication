package com.example.CarsApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "model")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "mark")
    private String mark;

    @Column(name = "VIN")
    private int vin;

    @Column(name = "power")
    private String power;

    @Column(name = "engine_capacity")
    private String engineCapacity;
}
