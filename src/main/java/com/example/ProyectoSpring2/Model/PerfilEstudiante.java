package com.example.ProyectoSpring2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "perfil_estudiante")
public class PerfilEstudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String direccion;
    private String telefono;
    private String correo;

    @OneToOne(mappedBy = "perfil")
    private Estudiante estudiante;
}