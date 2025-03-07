package com.examen_ad.academia.controller;

import com.examen_ad.academia.model.Aula;
import com.examen_ad.academia.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aulas")
public class AulaController {

    @Autowired
    private AulaService aulaService;

    @GetMapping
    public List<Aula> getAllAulas() {
        return aulaService.findAll();
    }

    public List<Aula> getAulaGreaterThan(Integer capacidad) {
        return aulaService.findCapacidadGreaterThan(capacidad);
    }

    @GetMapping("/{id}")
    public Aula getAulaById(@PathVariable Integer id) {
        return aulaService.findById(id);
    }

    @PostMapping
    public Aula createAula(@RequestBody Aula aula) {
        return aulaService.save(aula);
    }

    @PutMapping("/{id}")
    public Aula updateAula(@PathVariable Integer id, @RequestBody Aula aulaDetails) {
        return aulaService.update(id, aulaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAula(@PathVariable Integer id) {
        aulaService.delete(id);
    }
}
