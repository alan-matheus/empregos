package com.example.empregos.empregos.services;

import java.util.List;

import com.example.empregos.empregos.model.TipoUsuario;

public interface ServicesTipoUsuario {
    
    List<TipoUsuario> findAll();
    TipoUsuario findById(long id);
    TipoUsuario save(TipoUsuario tipoUsuario);
    TipoUsuario deleteById(long id);
}
