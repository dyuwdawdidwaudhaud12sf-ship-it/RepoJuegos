package com.example.repojuegos.Controller;

import com.example.repojuegos.Model.Juegos;
import com.example.repojuegos.Service.JuegosService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JuegosControllerTest {

    @Mock
    private JuegosService service;

    @InjectMocks
    private JuegosController controller;

    @Test
    void testListarTodos() {
        Juegos j = new Juegos();
        j.setNombre("God of War");

        when(service.obtenerTodos()).thenReturn(List.of(j));

        List<Juegos> lista = controller.listarTodos();
        assertEquals("God of War", lista.get(0).getNombre());
    }
}