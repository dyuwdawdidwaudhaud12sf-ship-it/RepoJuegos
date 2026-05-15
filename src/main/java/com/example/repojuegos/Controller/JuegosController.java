package com.example.repojuegos.Controller;

import com.example.repojuegos.Model.Juegos;
import com.example.repojuegos.Service.JuegosService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/juegos")
public class JuegosController {

    @Autowired
    private JuegosService service;

    @PostMapping
    public ResponseEntity<Juegos> crear(@Valid @RequestBody Juegos juego) {
        return ResponseEntity.ok(service.GuardarJuegos(juego));
    }

    @GetMapping
    public List<Juegos> listarTodos() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Juegos> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Juegos> actualizar(@PathVariable Long id,
                                             @Valid @RequestBody Juegos juego) {
        return ResponseEntity.ok(service.actualizarJuego(id, juego));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id) {
        service.eliminarJuego(id);
        return ResponseEntity.ok("Juego con id " + id + " eliminado correctamente");
    }
}