package com.portfolio.ap.controller;

import com.portfolio.ap.models.Datos;
import com.portfolio.ap.services.DatosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://argprograma-96e6e.web.app/")
@RestController
@RequestMapping("/api/datos")


public class DatosController {
    private final DatosService datosService;

    public DatosController(DatosService datosService) {
        this.datosService = datosService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Datos> obtenerUsuario(@PathVariable("id") Long id){
        Datos usuario= datosService.findUsuariosPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Datos> editarUsuario(@RequestBody Datos usuario){
        Datos updateUsuario= datosService.editUsuarios(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Datos> addUsuario(@RequestBody Datos usuario){
        Datos newUsuario= datosService.addUsuarios(usuario);
        return  new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Datos> deleteUsuario(@PathVariable("id") Long id){
        datosService.deleteUsuarios(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
