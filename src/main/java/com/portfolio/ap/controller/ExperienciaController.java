package com.portfolio.ap.controller;

import com.portfolio.ap.models.Experiencia;
import com.portfolio.ap.services.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://argprograma-96e6e.web.app/")
@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {

    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping
    public ResponseEntity<List<Experiencia>> findExperiencia(){
        List<Experiencia>  experiencia= experienciaService.findExperiencias();
        return new ResponseEntity<>(experiencia, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Experiencia> editExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia= experienciaService.editExperiencias(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia= experienciaService.addExperiencias(experiencia);
        return  new ResponseEntity<>(newExperiencia, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Experiencia> deleteExperiencia(@PathVariable("id") Long id){
        experienciaService.deleteExperiencias(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

