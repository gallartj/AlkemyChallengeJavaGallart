package com.alkemy.Jp.controllers;

import com.alkemy.Jp.entities.Pelicula;
import com.alkemy.Jp.entities.Personaje;
import com.alkemy.Jp.services.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

    @Autowired
    private PersonajeService pservice;

    @PostMapping()
    public ResponseEntity<Personaje> crear(@RequestBody Personaje personaje) {
        return new ResponseEntity<>(pservice.crear(personaje), HttpStatus.CREATED);

    }

    @PutMapping("{id}")
    public ResponseEntity<Void> editar(@RequestBody Personaje personaje){
        pservice.editar(personaje);
        return new ResponseEntity<>(HttpStatus.OK);


    }


    //Trae el listado de todos los personajes con los atributos Imagen y nombre.
    @GetMapping()
    public List<String> buscarTodos(String nombre, Integer edad, List<Pelicula> peliculas) {//check punto 6
        return pservice.mostrar();
    }


    //Elimina un personaje por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        pservice.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //Trae todos los datos de un personaje por ID
    @GetMapping("/{id}")
    public ResponseEntity<Personaje> buscarPorId(@PathVariable Long id) {

        return ResponseEntity.ok(pservice.buscarPorId(id));


    }


}
