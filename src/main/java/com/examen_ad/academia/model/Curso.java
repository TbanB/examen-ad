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
    private Integer idCurso;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "curso")
    private List<Alumno> alumnos;

    @OneToOne
    @JoinColumn(name = "id_aula")
    private Aula aula;

    @ManyToMany
    @JoinTable(name = "Profesor_Curso",
            joinColumns = @JoinColumn(name = "id_curso"),
            inverseJoinColumns = @JoinColumn(name = "id_profesor"))
    private List<Profesor> profesores;
}