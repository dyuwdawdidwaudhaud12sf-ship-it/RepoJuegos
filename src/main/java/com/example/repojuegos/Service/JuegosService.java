package com.example.repojuegos.Service;

import com.example.repojuegos.Model.Juegos;
import com.example.repojuegos.Repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class JuegosService {

    @Autowired

    private JuegosRepository repository;



    public Juegos GuardarJuegos(Juegos Juego) {

        return repository.save(Juego);

    }

    public List<Juegos> obtenerTodos() {

        return repository.findAll();

    }

}