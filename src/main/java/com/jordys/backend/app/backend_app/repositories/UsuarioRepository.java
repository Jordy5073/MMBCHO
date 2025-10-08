package com.jordys.backend.app.backend_app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jordys.backend.app.backend_app.models.entities.Usuarios;

public interface UsuarioRepository extends CrudRepository <Usuarios,Long> {

}
