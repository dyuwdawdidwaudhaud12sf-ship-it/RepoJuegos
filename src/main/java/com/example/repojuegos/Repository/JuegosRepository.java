package com.example.repojuegos.Repository;

import com.example.repojuegos.Model.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JuegosRepository extends JpaRepository<Juegos, Long> {

}