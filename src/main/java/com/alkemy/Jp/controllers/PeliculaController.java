package com.alkemy.Jp.controllers;

import com.alkemy.Jp.entities.Pelicula;
import com.alkemy.Jp.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class PeliculaController {

    @Autowired
    private PeliculaService pservice;

    @GetMapping()//meter parametros para el punto 6
    public List<String> buscarTodos() {
        return pservice.mostrar();
    }

    @GetMapping("{id}")
    public ResponseEntity<Pelicula> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(pservice.buscarPorId(id));
    }

    @PostMapping()
    public ResponseEntity<Pelicula> crear(Pelicula pelicula) {
        return new ResponseEntity<>(pservice.crear(pelicula), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> editar(@RequestBody Pelicula pelicula){
        pservice.editar(pelicula);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping()
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        pservice.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
