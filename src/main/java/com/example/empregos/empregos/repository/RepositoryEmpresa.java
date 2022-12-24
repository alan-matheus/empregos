package com.example.empregos.empregos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empregos.empregos.model.Empresa;

public interface RepositoryEmpresa extends JpaRepository<Empresa, Long> {
    
}
