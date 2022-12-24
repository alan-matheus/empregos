package com.example.empregos.empregos.services.servicesImpl;

import java.util.List;
import com.example.empregos.empregos.model.Vaga;
import com.example.empregos.empregos.repository.RepositoryVaga;
import com.example.empregos.empregos.services.ServicesVaga;

public class ServicesImplVaga implements ServicesVaga {

    RepositoryVaga repository;


    @Override
    public List<Vaga> findAll() {
        
        return repository.findAll();
    }

    @Override
    public Vaga findById(long id) {
        
        return repository.findById(id).get();
    }

    @Override
    public Vaga save(Vaga vaga) {
        
        return repository.save(vaga);
    }

    @Override
    public Vaga deleteById(long id) {
        
        return deleteById(id);
    }

    
}
