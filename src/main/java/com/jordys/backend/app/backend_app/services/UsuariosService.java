package com.jordys.backend.app.backend_app.services;

import java.util.List;
import java.util.Optional;

import com.jordys.backend.app.backend_app.models.entities.Usuarios;

public interface UsuariosService {
    
  List<Usuarios> findAll();
    
  Optional<Usuarios> findById(long id);

  Usuarios save(Usuarios user);

  Optional<Usuarios> update(Usuarios user, Long id);

  void remove(long id);

}
