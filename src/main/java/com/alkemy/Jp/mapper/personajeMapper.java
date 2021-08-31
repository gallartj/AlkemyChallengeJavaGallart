package com.alkemy.Jp.mapper;

import com.alkemy.Jp.entities.Personaje;
import com.alkemy.Jp.entities.PersonajeDTO;

public class personajeMapper {


    public PersonajeDTO dto(Personaje personaje){
        PersonajeDTO pdto = new PersonajeDTO();
        pdto.setImagen(personaje.getImagen());
        pdto.setNombre(personaje.getNombre());
        return pdto;

    }
}
