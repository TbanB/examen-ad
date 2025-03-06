package com.examen_ad.academia.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Curso")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "curso")
    private List<Alumno> alumnos;

    @ManyToMany(mappedBy = "cursos")
    private List<Profesor> profesores;
}