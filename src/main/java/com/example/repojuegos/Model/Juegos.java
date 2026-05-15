package com.example.repojuegos.Model;

import jakarta.persistence.*;

import lombok.Data;

@Entity

@Table(name = "estudiantes")

@Data

public class Juegos {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String Desarrolladora;

    private String Motor;

    private int AñoDeSalida;

    private int Presupuesto;

    private int Ventas;

    private int Beneficio;

}