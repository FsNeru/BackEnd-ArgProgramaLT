package com.portfolio.ap.services;


import com.portfolio.ap.models.Experiencia;
import com.portfolio.ap.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    public Experiencia addExperiencias(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public List<Experiencia> findExperiencias(){
        return experienciaRepo.findAll();
    }
    public Experiencia editExperiencias(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void deleteExperiencias(Long id){
        experienciaRepo.deleteById(id);
    }

}
