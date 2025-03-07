package com.examen_ad.academia.controller;

import com.examen_ad.academia.model.Profesor;
import com.examen_ad.academia.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @GetMapping
    public List<Profesor> getAllProfesors() {
        return profesorService.findAll();
    }

    @GetMapping("/{id}")
    public Profesor getProfesorById(@PathVariable Integer id) {
        return profesorService.findById(id);
    }

    @PostMapping
    public Profesor createProfesor(@RequestBody Profesor profesor) {
        return profesorService.save(profesor);
    }

    @PutMapping("/{id}")
    public Profesor updateProfesor(@PathVariable Integer id, @RequestBody Profesor profesorDetails) {
        return profesorService.update(id, profesorDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesor(@PathVariable Integer id) {
        profesorService.delete(id);
    }
}
