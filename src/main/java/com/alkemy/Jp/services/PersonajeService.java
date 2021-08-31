package com.alkemy.Jp.services;

import com.alkemy.Jp.entities.Personaje;
import com.alkemy.Jp.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonajeService {
    @Autowired
    private PersonajeRepository prepository;


    @Transactional
    public Personaje crear(Personaje personaje){
        Personaje p = new Personaje();
        p.setIdPersonaje(personaje.getIdPersonaje());
        p.setImagen(personaje.getImagen());
        p.setNombre(personaje.getNombre());
        p.setEdad(personaje.getEdad());
        p.setPeso(personaje.getPeso());
        p.setHistoria(personaje.getHistoria());
        prepository.save(p);
        return p;
    }


    @Transactional
    public List<String> mostrar(){
        return prepository.mostrarnombre();
    }

    @Transactional
    public void eliminar(Long id){
        prepository.deleteById(id);
    }

    @Transactional
    public Personaje buscarPorId(Long id){
       return prepository.findById(id).orElse(null);
    }

    @Transactional
    public void editar(Personaje personaje){
         prepository.save(personaje);
    }







}
