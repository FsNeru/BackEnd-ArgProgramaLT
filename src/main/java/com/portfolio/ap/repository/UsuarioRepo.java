package com.portfolio.ap.repository;

import com.portfolio.ap.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    Optional<Usuario> findByEmail(String email);

}
