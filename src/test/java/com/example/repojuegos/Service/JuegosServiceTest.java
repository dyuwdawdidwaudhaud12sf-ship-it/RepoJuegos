package com.example.repojuegos.Service;

import com.example.repojuegos.Model.Juegos;
import com.example.repojuegos.Repository.JuegosRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class JuegosServiceTest {

    @Mock
    private JuegosRepository repository;

    @InjectMocks
    private JuegosService service;

    private Juegos juego;

    @BeforeEach
    void setUp() {
        juego = new Juegos();
        juego.setId(5L);
        juego.setNombre("Minecraft");
    }

    @Test
    void testGuardarJuego() {
        when(repository.save(any(Juegos.class))).thenReturn(juego);
        Juegos guardado = service.GuardarJuegos(new Juegos());
        assertNotNull(guardado);
        assertEquals("God of War", guardado.getNombre());
        verify(repository, times(1)).save(any(Juegos.class));
    }

    @Test
    void testObtenerTodos() {
        when(repository.findAll()).thenReturn(List.of(juego));
        List<Juegos> lista = service.obtenerTodos();
        assertFalse(lista.isEmpty());
        assertEquals(1, lista.size());
        verify(repository, times(1)).findAll();
    }
}