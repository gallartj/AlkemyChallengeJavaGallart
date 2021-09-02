package com.alkemy.Jp.repositories;

import com.alkemy.Jp.entities.Pelicula;
import com.alkemy.Jp.entities.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {


    @Query("Select p.nombre,p.imagen from Personaje p")
    List<String> mostrarnombre();

    List<Personaje> findByNombreContaining(String nombre);

    List<Personaje> findByEdad(Integer edad);

    List<Personaje> findByPeliculasIn(List<Pelicula> p);







}
