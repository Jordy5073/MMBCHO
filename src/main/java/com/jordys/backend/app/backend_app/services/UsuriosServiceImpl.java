package com.jordys.backend.app.backend_app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jordys.backend.app.backend_app.models.entities.Usuarios;
import com.jordys.backend.app.backend_app.repositories.UsuarioRepository;


@Service 
public class UsuriosServiceImpl implements UsuariosService { 

    
    @Autowired
    private UsuarioRepository usuariosRepository;

   
    @Override
    @Transactional
    public List<Usuarios> findAll() {
       
        return ( List<Usuarios>) usuariosRepository.findAll();
    }
}