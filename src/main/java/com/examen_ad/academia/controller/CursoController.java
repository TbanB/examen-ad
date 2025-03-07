package com.examen_ad.academia.controller;

import com.examen_ad.academia.model.Curso;
import com.examen_ad.academia.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable Integer id) {
        return cursoService.findById(id);
    }

    @GetMapping("/aula/{id}")
    public List<Curso> getCursoByAulaId(@PathVariable Integer id) {
        System.out.println("id: " + id);
        return cursoService.findCursosByAulaId(id);
    }

    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {
        return cursoService.save(curso);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Integer id, @RequestBody Curso cursoDetails) {
        return cursoService.update(id, cursoDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Integer id) {
        cursoService.delete(id);
    }
}
