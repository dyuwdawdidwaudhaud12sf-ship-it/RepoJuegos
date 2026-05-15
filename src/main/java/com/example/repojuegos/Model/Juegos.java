package com.example.repojuegos.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "juegos")
@Data
public class Juegos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @NotBlank(message = "La desarrolladora no puede estar vacía")
    private String Desarrolladora;

    private String Motor;

    @Min(value = 1970, message = "El año de salida debe ser 1970 o posterior")
    private int AñoDeSalida;

    @PositiveOrZero(message = "El presupuesto no puede ser negativo")
    private int Presupuesto;

    @PositiveOrZero(message = "Las ventas no pueden ser negativas")
    private int Ventas;

    private int Beneficio;
}