package com.jordys.backend.app.backend_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordys.backend.app.backend_app.models.entities.Usuarios_roles;

import com.jordys.backend.app.backend_app.repositories.UsuariosRolesRepository;
import jakarta.transaction.Transactional;


@Service
public class UsuariosRolesServiceImpl implements UsuariosRolesService{


    
    @Autowired
    private UsuariosRolesRepository usuariosRolesRepository;

    @Override
    @Transactional
    public List<Usuarios_roles> findAll() {
        return (List<Usuarios_roles>) usuariosRolesRepository.findAll();
    }


}
