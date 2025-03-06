package com.examen_ad.academia.service;

import com.examen_ad.academia.model.Curso;
import com.examen_ad.academia.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso update(Long id, Curso cursoDetails) {
        Curso curso = findById(id);
        if (curso != null) {
            curso.setNombre(cursoDetails.getNombre());
            curso.setIdCurso(cursoDetails.getIdCurso());
            curso.setProfesores(cursoDetails.getProfesores());
            return cursoRepository.save(curso);
        }
        return null;
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }
}
