package com.example.lab3_20170404.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctor")
@Getter
@Setter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "especialidad",nullable = false, length = 50)
    private  String especialidad;


    @OneToOne
    @JoinColumn(name = "hospital_id")
    private Doctor hospital;

   }
