package com.examen_ad.academia.repository;

import com.examen_ad.academia.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
    List<Alumno> findByCursoIdCurso(Integer idCurso);
}