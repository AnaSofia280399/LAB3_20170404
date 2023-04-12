package com.example.lab3_20170404.controller;

import com.example.lab3_20170404.entity.Hospital;
import com.example.lab3_20170404.repository.DoctorRepository;
import com.example.lab3_20170404.repository.HospitalRepository;
import com.example.lab3_20170404.repository.PacienteRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalRepository hospitalRepository;

    @GetMapping(value = {"/lista", ""})
    public String listarHospitales(Model model) {

        List<Hospital> lista = hospitalRepository.findAll();
        model.addAttribute("hospitalList", lista);
        model.addAttribute("listaPacientePorHospital", PacienteRepository.obtenerPacientesPorHospital())

        return "hospitales/lista";
    }








}
