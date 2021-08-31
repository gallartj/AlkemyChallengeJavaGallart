package com.alkemy.Jp.services;

import com.alkemy.Jp.entities.Pelicula;
import com.alkemy.Jp.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository prepository;


    @Transactional
    public List<String> mostrar() {
        return prepository.mostrar();
    }

    @Transactional
    public Pelicula buscarPorId(Long id) {
        return prepository.findById(id).orElse(null);
    }

    @Transactional
    public Pelicula crear(Pelicula pelicula) {
        Pelicula p = new Pelicula();
        p.setCalificacion(pelicula.getCalificacion());
        p.setFechaCreacion(pelicula.getFechaCreacion());
        p.setIDpelicula(pelicula.getIDpelicula());
        p.setImagen(pelicula.getImagen());
        p.setTitulo(pelicula.getTitulo());
        p.setPersonajes(pelicula.getPersonajes());

        prepository.save(p);
        return p;


    }

    @Transactional
    public void editar(Pelicula pelicula){

        prepository.save(pelicula);

    }

    @Transactional
    public void eliminar(Long id){
        prepository.deleteById(id);

    }


}
