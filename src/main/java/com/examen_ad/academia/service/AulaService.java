package com.examen_ad.academia.service;

import com.examen_ad.academia.model.Aula;
import com.examen_ad.academia.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AulaService {

    @Autowired
    private AulaRepository aulaRepository;

    public List<Aula> findAll() {
        return aulaRepository.findAll();
    }

    public Aula findById(Long id) {
        return aulaRepository.findById(id).orElse(null);
    }

    public Aula save(Aula aula) {
        return aulaRepository.save(aula);
    }

    public Aula update(Long id, Aula aulaDetails) {
        Aula aula = findById(id);
        if (aula != null) {
            aula.setNombre(aulaDetails.getNombre());
            aula.setIdAula(aulaDetails.getIdAula());
            aula.setCapacidad(aulaDetails.getCapacidad());
            return aulaRepository.save(aula);
        }
        return null;
    }

    public void delete(Long id) {
        aulaRepository.deleteById(id);
    }
}
