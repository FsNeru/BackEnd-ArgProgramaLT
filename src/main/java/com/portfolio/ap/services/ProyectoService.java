package com.portfolio.ap.services;


import com.portfolio.ap.models.Proyecto;
import com.portfolio.ap.repository.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepo proyectoRepo;

    @Autowired
    public ProyectoService(ProyectoRepo proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }
    public Proyecto addProyectos(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public List<Proyecto> findProyectos(){
        return proyectoRepo.findAll();
    }
    public Proyecto editProyectos(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public void deleteProyectos(Long id){
        proyectoRepo.deleteById(id);
    }

}