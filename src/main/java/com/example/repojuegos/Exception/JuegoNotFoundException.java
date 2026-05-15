package com.example.repojuegos.Exception;

public class JuegoNotFoundException extends RuntimeException {
    public JuegoNotFoundException(Long id) {
        super("Juego no encontrado con id: " + id);
    }
}