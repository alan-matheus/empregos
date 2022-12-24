package com.example.empregos.empregos.services;

import java.util.List;

import com.example.empregos.empregos.model.Usuario;

public interface ServicesUsuario {
    List<Usuario> findAll();
    Usuario findById(long id);
    Usuario save(Usuario candidato); 
    Usuario deleteById(long id);

}
