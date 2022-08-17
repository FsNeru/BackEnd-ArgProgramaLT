package com.portfolio.ap.controller;

import com.portfolio.ap.models.Educacion;
import com.portfolio.ap.services.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://argprograma-96e6e.web.app/")
@RestController
@RequestMapping("/api/educacion")

public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping
    public ResponseEntity<List<Educacion>> findEducacion(){
        List<Educacion>  educaciones= educacionService.findEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Educacion> editEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion= educacionService.editEducaciones(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion){
        Educacion newEducacion=educacionService.addEducaciones(educacion);
        return  new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Educacion> deleteEducacion(@PathVariable("id") Long id){
        educacionService.deleteEducaciones(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
