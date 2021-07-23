package com.alkemy.Jp.repositories;

import com.alkemy.Jp.entities.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    @Modifying
    @Query("Select p.imagen,p.nombre from Personaje p")
    public List<Personaje> mostrarnombreimagen();







}
