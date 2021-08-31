package com.alkemy.Jp.repositories;

import com.alkemy.Jp.entities.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {

    @Query("SELECT p.imagen, p.titulo, p.fechaCreacion from Pelicula p")
    List<String> mostrar();



}
