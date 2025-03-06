package com.examen_ad.academia.controller;

import com.examen_ad.academia.model.Alumno;
import com.examen_ad.academia.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> getAllAlumnos() {
        return alumnoService.findAll();
    }

    @GetMapping("/{id}")
    public Alumno getAlumnoById(@PathVariable Long id) {
        return alumnoService.findById(id);
    }

    @GetMapping("/{id}/cursos")
    public List<Alumno> getAlumnoCursosById(@PathVariable Long id) {
        return alumnoService.findByCursoId(id);
    }

    @PostMapping
    public Alumno createAlumno(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }

    @PutMapping("/{id}")
    public Alumno updateAlumno(@PathVariable Long id, @RequestBody Alumno alumnoDetails) {
        return alumnoService.update(id, alumnoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAlumno(@PathVariable Long id) {
        alumnoService.delete(id);
    }
}
