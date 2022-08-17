package com.portfolio.ap.controller;

import com.portfolio.ap.models.Proyecto;
import com.portfolio.ap.services.ProyectoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://argprograma-96e6e.web.app/")
@RestController
@RequestMapping("/api/proyecto")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping
    public ResponseEntity<List<Proyecto>> findProyecto(){
        List<Proyecto>  proyectos= proyectoService.findProyectos();
        return new ResponseEntity<>(proyectos, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Proyecto> editProyecto(@RequestBody Proyecto proyecto){
        Proyecto updateProyecto= proyectoService.editProyectos(proyecto);
        return new ResponseEntity<>(updateProyecto, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Proyecto> addProyecto(@RequestBody Proyecto proyecto){
        Proyecto newProyecto= proyectoService.addProyectos(proyecto);
        return  new ResponseEntity<>(newProyecto, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Proyecto> deleteEducacion(@PathVariable("id") Long id){
        proyectoService.deleteProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}