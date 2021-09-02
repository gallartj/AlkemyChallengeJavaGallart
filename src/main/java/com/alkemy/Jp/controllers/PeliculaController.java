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
    private PeliculaService peliculaService;

    @GetMapping()
    public List<Pelicula> buscarTodos(@RequestParam(required = false) String nombre,
                                      @RequestParam(required = false) Long IdGenero,
                                      @RequestParam(required = false) Boolean ordenar) {

        if (nombre != null) {
            return peliculaService.mostrar(nombre);
        }
        if (IdGenero != null) {
            return peliculaService.mostrar(IdGenero);
        }
        if (ordenar == true) {
            //crear un metodo para ordenar los generos de forma ascendente

            return peliculaService.mostrar(ordenar);
        }
        if(ordenar == false){
            // // // de forma descendente

            return peliculaService.mostrar(ordenar);
        }

        return peliculaService.mostrar(null);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(peliculaService.buscarPorId(id));
    }

    @PostMapping()
    public ResponseEntity<Pelicula> crear(@RequestBody Pelicula pelicula) {
        return new ResponseEntity<>(peliculaService.crear(pelicula), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> editar(@RequestBody Pelicula pelicula) {
        peliculaService.editar(pelicula);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        peliculaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}
