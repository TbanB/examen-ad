package com.examen_ad.academia.service;

import com.examen_ad.academia.model.Curso;
import com.examen_ad.academia.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Curso findById(Integer id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public List<Curso> findCursosByAulaId(Integer id) {
        return cursoRepository.findByAulaId(id);
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso update(Integer id, Curso cursoDetails) {
        Curso curso = findById(id);
        if (curso != null) {
            curso.setNombre(cursoDetails.getNombre());
            curso.setIdCurso(cursoDetails.getIdCurso());
            curso.setProfesores(cursoDetails.getProfesores());
            return cursoRepository.save(curso);
        }
        return null;
    }

    public void delete(Integer id) {
        cursoRepository.deleteById(id);
    }
}
