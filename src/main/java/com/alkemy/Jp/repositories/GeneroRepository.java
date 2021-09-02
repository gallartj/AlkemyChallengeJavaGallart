package com.alkemy.Jp.repositories;

import com.alkemy.Jp.entities.Genero;
import com.alkemy.Jp.entities.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeneroRepository extends JpaRepository<Genero,Long> {

@Query("SELECT g.peliculasAsociadas FROM Genero g where g.IDgenero= :IdGenero")
    List<Pelicula> fitrarPorGenero(@Param("IdGenero") Long IdGenero);

}
