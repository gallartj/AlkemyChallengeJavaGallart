package com.alkemy.Jp.services;

import com.alkemy.Jp.entities.Pelicula;
import com.alkemy.Jp.repositories.GeneroRepository;
import com.alkemy.Jp.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    PeliculaRepository prepository;
    @Autowired
    GeneroRepository generoRepository;


    @Transactional
    public List<Pelicula> mostrar(Object o) {
        List<Pelicula> pel = new ArrayList<>();
        if (o instanceof String) {
            String nombre = (String) o;
            pel = prepository.findByTituloContaining(nombre);
        } else if (o instanceof Long) {
            Long IdGenero = (Long) o;
            pel = generoRepository.fitrarPorGenero(IdGenero);
        } else if (o instanceof Boolean) {
            Boolean ordenar = (Boolean) o;
            if (ordenar == true) {
                System.out.println("true");
                pel = prepository.orderByASC();
            } else {
                System.out.println("false");
                pel = prepository.orderByDESC();
            }
        }else{
            return prepository.findAll();
        }
        return pel;
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
        p.setImagen(pelicula.getImagen());
        p.setTitulo(pelicula.getTitulo());
        p.setPersonajes(pelicula.getPersonajes());

        prepository.save(p);
        return p;


    }

    @Transactional
    public void editar(Pelicula pelicula) {

        prepository.save(pelicula);

    }

    @Transactional
    public void eliminar(Long id) {
        prepository.deleteById(id);

    }


}
