package com.example.repojuegos.Service;

import com.example.repojuegos.Exception.JuegoNotFoundException;
import com.example.repojuegos.Model.Juegos;
import com.example.repojuegos.Repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuegosService {

    @Autowired
    private JuegosRepository repository;

    public Juegos GuardarJuegos(Juegos juego) {
        return repository.save(juego);
    }

    public List<Juegos> obtenerTodos() {
        return repository.findAll();
    }

    public Juegos obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new JuegoNotFoundException(id));
    }

    public Juegos actualizarJuego(Long id, Juegos datosNuevos) {
        Juegos existente = obtenerPorId(id);
        existente.setNombre(datosNuevos.getNombre());
        existente.setDesarrolladora(datosNuevos.getDesarrolladora());
        existente.setMotor(datosNuevos.getMotor());
        existente.setAñoDeSalida(datosNuevos.getAñoDeSalida());
        existente.setPresupuesto(datosNuevos.getPresupuesto());
        existente.setVentas(datosNuevos.getVentas());
        existente.setBeneficio(datosNuevos.getBeneficio());
        return repository.save(existente);
    }

    public void eliminarJuego(Long id) {
        obtenerPorId(id);
        repository.deleteById(id);
    }
}