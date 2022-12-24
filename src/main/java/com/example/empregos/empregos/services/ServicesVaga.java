package com.example.empregos.empregos.services;

import java.util.List;

import com.example.empregos.empregos.model.Vaga;

public interface ServicesVaga {
    List<Vaga> findAll();
    Vaga findById(long id);
    Vaga save(Vaga vaga);
    Vaga deleteById(long id);
    
    
}
