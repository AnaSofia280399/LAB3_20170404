package com.example.lab3_20170404.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository {

    @Query(value = "select\tp.nombre from paciente p inner join hospital h on (p.hospital_id = h.id) \n" +
            "inner join doctor d on (p.doctor_id = d.id)", nativeQuery = true)
    List<PacientesPorDoctorHospital> obtenerPacientesPorHospital();


}
