package com.example.empregos.empregos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empregos.empregos.model.TipoUsuario;

@Repository
public interface RepositoryTipoUsuario extends JpaRepository<TipoUsuario, Long> {
    
}
