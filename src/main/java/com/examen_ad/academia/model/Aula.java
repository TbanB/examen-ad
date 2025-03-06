package com.examen_ad.academia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Aula")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aula")
    private Long idAula;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer capacidad;

    @OneToOne
    @JoinColumn(name = "id_aula")
    private Aula aula;
}
