package com.example.lab3_20170404.repository;

import com.example.lab3_20170404.entity.Hospital;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository


public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

   List<Hospital> findByNombre(String nombre);






}
