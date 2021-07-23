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
    public void crear(Long IDpersonaje,Byte[] imagen,String nombre,Integer edad, Double peso, String historia){
        Personaje p = new Personaje();
        p.setIDpersonaje(IDpersonaje);
        p.setImagen(imagen);
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setPeso(peso);
        p.setHistoria(historia);
        prepository.save(p);
    }

    @Transactional
    public List<Personaje> buscarTodos(){
        return prepository.findAll();
    }

    @Transactional
    public List<Personaje> MostrarNombreImagen(){
        return prepository.mostrarnombreimagen();
    }








}
