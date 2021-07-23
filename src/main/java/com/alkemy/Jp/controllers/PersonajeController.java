package com.alkemy.Jp.controllers;

import com.alkemy.Jp.entities.Personaje;
import com.alkemy.Jp.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonajeController {

    @Autowired
    private PersonajeService pservice;



    @PostMapping
    @GetMapping("/characters")
    public ModelAndView ListadoDePersonajes(){
        ModelAndView mav = new ModelAndView("htmlname");
        List<Personaje> personajes = pservice.MostrarNombreImagen();
        mav.addObject("personajes",personajes);
        return mav;
    }









}
