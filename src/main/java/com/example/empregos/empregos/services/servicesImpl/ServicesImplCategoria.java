package com.example.empregos.empregos.services.servicesImpl;

import java.util.List;

import com.example.empregos.empregos.model.Categoria;
import com.example.empregos.empregos.repository.RepositoryCategoria;
import com.example.empregos.empregos.services.ServicesCategoria;

public class ServicesImplCategoria implements ServicesCategoria {

    RepositoryCategoria repository;

    @Override
    public List<Categoria> findAll() {
       
        return repository.findAll();
    }

    @Override
    public Categoria findById(long id) {
        
        return repository.findById(id).get();
    }

    @Override
    public Categoria save(Categoria categoria) {
        
        return repository.save(categoria);
    }

    @Override
    public Categoria deleteById(long id) {
        
        return deleteById(id);
    }


   
    
}
