package com.example.ProyectoSpring2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nombre;
    private String telefono;

    @ManyToMany
    @JoinTable(
            name = "estudiante_curso",
            joinColumns = @JoinColumn(name = "estudiante_id"),
            inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

    @ManyToMany
    @JoinTable(
            name = "estudiante_asignatura",
            joinColumns = @JoinColumn(name = "estudiante_id"),
            inverseJoinColumns = @JoinColumn(name = "asignatura_id")
    )
    private List<Asignatura> asignaturas;

    @OneToOne
    @JoinColumn(name = "perfil_id")
    private PerfilEstudiante perfil;

    public Estudiante() {}

    public Estudiante(long codigo, String nombre, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
