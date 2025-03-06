package com.examen_ad.academia.controller;

import com.examen_ad.academia.model.Curso;
import com.examen_ad.academia.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable Long id) {
        return cursoService.findById(id);
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Long id, @RequestBody Curso cursoDetails) {
        return cursoService.update(id, cursoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        cursoService.delete(id);
    }
}
