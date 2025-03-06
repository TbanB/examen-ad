package com.examen_ad.academia.controller;

import com.examen_ad.academia.model.Aula;
import com.examen_ad.academia.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AulaController {

    @Autowired
    private AulaService aulaService;

    @GetMapping
    public List<Aula> getAllAulas() {
        return aulaService.findAll();
    }

    @GetMapping("/{id}")
    public Aula getAulaById(@PathVariable Long id) {
        return aulaService.findById(id);
    }

    @PostMapping
    public Aula createAula(@RequestBody Aula aula) {
        return aulaService.save(aula);
    }

    @PutMapping("/{id}")
    public Aula updateAula(@PathVariable Long id, @RequestBody Aula aulaDetails) {
        return aulaService.update(id, aulaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAula(@PathVariable Long id) {
        aulaService.delete(id);
    }
}
