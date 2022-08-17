package com.portfolio.ap.repository;

import com.portfolio.ap.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill,Long> {
}
