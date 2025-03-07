package com.examen_ad.academia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Alumno")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno")
    private Integer idAlumno;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;
}