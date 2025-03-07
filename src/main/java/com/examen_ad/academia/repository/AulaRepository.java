package com.examen_ad.academia.repository;

import com.examen_ad.academia.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {
    List<Aula> findByCapacidadGreaterThan(Integer capacidad);
}