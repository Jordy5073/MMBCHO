package com.jordys.backend.app.backend_app.services;

import java.util.List;

import com.jordys.backend.app.backend_app.models.entities.Usuarios;

public interface UsuariosService {
    
    List<Usuarios> findAll();

}
