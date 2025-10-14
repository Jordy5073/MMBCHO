package com.jordys.backend.app.backend_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordys.backend.app.backend_app.models.entities.Notas;
import com.jordys.backend.app.backend_app.repositories.NotasRespository;

import jakarta.transaction.Transactional;

@Service
public class NotasServiceImlp implements NotasService {

    @Autowired 
    private NotasRespository notasRespository;

    @Override
    @Transactional
    public List<Notas> findAll () {
        return (List<Notas>) notasRespository.findAll();
    }



}
