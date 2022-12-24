package com.example.empregos.empregos.services;

import java.util.List;

import com.example.empregos.empregos.model.Empresa;

public interface ServicesEmpresa {
    
    List<Empresa> findAll();
    Empresa findById(long id);
    Empresa deleteById(long id);
    Empresa save(Empresa empresa);
}
