package com.example.empregos.empregos.services.servicesImpl;

import java.util.List;
import com.example.empregos.empregos.model.TipoUsuario;
import com.example.empregos.empregos.repository.RepositoryTipoUsuario;
import com.example.empregos.empregos.services.ServicesTipoUsuario;

public class ServicesImplTipoUsuario implements ServicesTipoUsuario{

    RepositoryTipoUsuario repository;

    @Override
    public List<TipoUsuario> findAll() {
        
        return repository.findAll();
    }

    @Override
    public TipoUsuario findById(long id) {
        
        return repository.findById(id).get();
    }

    @Override
    public TipoUsuario save(TipoUsuario tipoUsuario) {
        
        return repository.save(tipoUsuario);
    }

    @Override
    public TipoUsuario deleteById(long id) {
        
        return deleteById(id);
    }
    
}
