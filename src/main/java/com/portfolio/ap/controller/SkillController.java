package com.portfolio.ap.controller;

import com.portfolio.ap.models.Skill;
import com.portfolio.ap.services.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://argprograma-96e6e.web.app/")
@RestController
@RequestMapping("/api/skill")
public class SkillController {
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public ResponseEntity<List<Skill>> findSkill(){
        List<Skill>  skills= skillService.findSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Skill> editSkill(@RequestBody Skill skill){
        Skill updateSkill= skillService.editSkills(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        Skill newSkill= skillService.addSkills(skill);
        return  new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Skill> deleteEducacion(@PathVariable("id") Long id){
        skillService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
