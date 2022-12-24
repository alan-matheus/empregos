package com.example.empregos.empregos.services.servicesImpl;

import java.util.List;
import com.example.empregos.empregos.model.Usuario;
import com.example.empregos.empregos.repository.RepositoryUsuario;
import com.example.empregos.empregos.services.ServicesUsuario;

public class ServicesImplUsuario implements ServicesUsuario{

    RepositoryUsuario repository;
    @Override
    public Usuario deleteById(long id) {
        
        return deleteById(id);
    }

    @Override
    public List<Usuario> findAll() {
        
        return repository.findAll();
    }

    @Override
    public Usuario findById(long id) {
        
        return repository.findById(id).get();
    }

    @Override
    public Usuario save(Usuario candidato) {
        
        return repository.save(candidato);
    }
    
}
