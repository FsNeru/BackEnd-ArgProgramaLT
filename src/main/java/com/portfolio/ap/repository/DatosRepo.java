package com.portfolio.ap.repository;

import com.portfolio.ap.models.Datos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosRepo extends JpaRepository<Datos,Long> {
}
