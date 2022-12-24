package com.example.empregos.empregos.services;

import java.util.List;
import com.example.empregos.empregos.model.Categoria;

public interface ServicesCategoria {
    List<Categoria> findAll();
    Categoria findById(long id);
    Categoria save(Categoria categoria);
    Categoria deleteById(long id);
    
    
}
