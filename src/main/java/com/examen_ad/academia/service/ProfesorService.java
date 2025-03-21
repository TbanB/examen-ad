package com.examen_ad.academia.service;

import com.examen_ad.academia.model.Profesor;
import com.examen_ad.academia.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    public Profesor findById(Integer id) {
        return profesorRepository.findById(id).orElse(null);
    }

    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public Profesor update(Integer id, Profesor profesorDetails) {
        Profesor profesor = findById(id);
        if (profesor != null) {
            profesor.setNombre(profesorDetails.getNombre());
            profesor.setIdProfesor(profesorDetails.getIdProfesor());
            profesor.setCursos(profesorDetails.getCursos());
            profesor.setEmail(profesorDetails.getEmail());
            profesor.setAula(profesorDetails.getAula());
            return profesorRepository.save(profesor);
        }
        return null;
    }

    public void delete(Integer id) {
        profesorRepository.deleteById(id);
    }
}
