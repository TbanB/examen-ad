package com.examen_ad.academia.repository;

import com.examen_ad.academia.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    @Query("SELECT c FROM Curso c WHERE c.aula.id = :aulaId")
    List<Curso> findByAulaId(@Param("aulaId") Integer aulaId);
}