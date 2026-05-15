package com.example.repojuegos.Controller;

import com.example.repojuegos.Model.Juegos;
import com.example.repojuegos.Service.JuegosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/juegos")

public class JuegosController {

    @Autowired

    private JuegosService service;


    @PostMapping

    public Juegos crear(@RequestBody Juegos juego) {

        return service.GuardarJuegos(juego);

    }

    @GetMapping

    public List<Juegos> listarTodos() {

        return service.obtenerTodos();

    }

}
