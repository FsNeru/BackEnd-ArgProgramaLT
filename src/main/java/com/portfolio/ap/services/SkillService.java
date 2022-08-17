package com.portfolio.ap.services;


import com.portfolio.ap.models.Skill;
import com.portfolio.ap.repository.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillService {
    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }
    public Skill addSkills(Skill skill){
        return skillRepo.save(skill);
    }
    public List<Skill> findSkills(){
        return skillRepo.findAll();
    }
    public Skill editSkills(Skill skill){
        return skillRepo.save(skill);
    }
    public void deleteSkills(Long id){
        skillRepo.deleteById(id);
    }

}
