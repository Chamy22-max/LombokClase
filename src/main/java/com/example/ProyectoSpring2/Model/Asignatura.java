package com.example.ProyectoSpring2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Estudiante> estudiantes;

    @ManyToMany
    @JoinTable(
            name = "asignatura_curso",
            joinColumns = @JoinColumn(name = "asignatura_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;
}
