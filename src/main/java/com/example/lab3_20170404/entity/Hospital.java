package com.example.lab3_20170404.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="hospital")
@Getter
@Setter
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "direccion", nullable = false, length = 100)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 45)
    private String telefono;


}
