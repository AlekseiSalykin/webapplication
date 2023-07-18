package com.example.CarsApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "usr_role")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "id_user")
    private Long userId;
    @Column(name = "id_role")
    private Long roleId;

}
