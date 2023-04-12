package com.example.lab3_20170404.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Getter
@Setter
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private Integer edad;

    @Column(name = "genero", nullable = false, length = 45)
    private String genero;

    @Column(name = "diagnostico", nullable = false, length = 100)
    private String diagnostico;

    @Column(name = "fecha_cita", nullable = false)
    private Date fecha_cita;

    @Column(name = "numero_habitacion", nullable = false)
    private Integer numero_habitacion;


    @OneToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    private Paciente hospital_id;


    @OneToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Paciente doctor_id;





}
