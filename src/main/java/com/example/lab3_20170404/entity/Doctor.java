package com.example.lab3_20170404.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "especialidad",nullable = false, length = 50)
    private  String especialidad;

    @Column(name = "hospital_id", nullable = false)
    private Integer hospital_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(Integer hospital_id) {
        this.hospital_id = hospital_id;
    }
}
