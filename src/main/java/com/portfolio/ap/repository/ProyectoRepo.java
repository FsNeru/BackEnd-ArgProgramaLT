package com.portfolio.ap.repository;

import com.portfolio.ap.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository<Proyecto,Long> {
}
