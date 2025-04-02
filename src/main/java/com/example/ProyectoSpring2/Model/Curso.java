package com.example.ProyectoSpring2.Model;

import com.example.ProyectoSpring2.Model.Estudiante;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;

    @ManyToMany(mappedBy = "cursos")
    private List<Estudiante> estudiantes;

    @ManyToMany(mappedBy = "cursos")
    private List<com.example.ProyectoSpring2.Model.Asignatura> asignaturas;

    // Getters y Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<com.example.ProyectoSpring2.Model.Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<com.example.ProyectoSpring2.Model.Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}