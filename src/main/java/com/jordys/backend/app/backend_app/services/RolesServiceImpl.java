package com.jordys.backend.app.backend_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordys.backend.app.backend_app.models.entities.Roles;
import com.jordys.backend.app.backend_app.repositories.RolesRepository;

import jakarta.transaction.Transactional;

@Service

public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    @Transactional
    public List<Roles> findAll() {
        return (List<Roles>) rolesRepository.findAll();
    }


}
