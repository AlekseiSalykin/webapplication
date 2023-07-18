package com.example.CarsApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "document")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_model")
    private Long modelId;

    @Column(name = "number_car")
    private String numberCar;
}
