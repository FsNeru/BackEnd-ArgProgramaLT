package com.portfolio.ap.services;

import com.portfolio.ap.models.Educacion;
import com.portfolio.ap.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducaciones(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion editEducaciones(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducaciones(Long id) {
        educacionRepo.deleteById(id);
    }

}
