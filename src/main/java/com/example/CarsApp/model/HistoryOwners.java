package com.example.CarsApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "history_owners")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class HistoryOwners {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "date_buy")
    private String dateBuy;

    @Column(name = "id_car")
    private Long carId;

    @Column(name = "id_owner")
    private Long userId;

    @Column(name = "id_document")
    private Long documentId;
}
