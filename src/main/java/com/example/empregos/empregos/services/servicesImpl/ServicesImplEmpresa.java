package com.example.empregos.empregos.services.servicesImpl;

import java.util.List;

import com.example.empregos.empregos.model.Empresa;
import com.example.empregos.empregos.repository.RepositoryEmpresa;
import com.example.empregos.empregos.services.ServicesEmpresa;

public class ServicesImplEmpresa implements ServicesEmpresa{

    RepositoryEmpresa repository;

    @Override
    public List<Empresa> findAll() {
        
        return repository.findAll() ;
    }

    @Override
    public Empresa findById(long id) {
        
        return repository.findById(id).get();
    }

    @Override
    public Empresa deleteById(long id) {
        
        return deleteById(id);
    }

    @Override
    public Empresa save(Empresa empresa) {
        
        return repository.save(empresa);
    }
    
}
