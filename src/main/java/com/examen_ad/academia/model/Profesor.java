package com.examen_ad.academia.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Profesor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profesor")
    private Long idProfesor;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_aula", nullable = false)
    private Aula aula;

    @ManyToMany
    @JoinTable(
            name = "profesor_curso",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id"))
    private List<Curso> cursos;

}