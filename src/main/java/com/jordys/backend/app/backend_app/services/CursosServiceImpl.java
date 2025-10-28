package com.jordys.backend.app.backend_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordys.backend.app.backend_app.models.entities.Cursos;
import com.jordys.backend.app.backend_app.repositories.CursosRepository;

import jakarta.transaction.Transactional;

@Service
public class CursosServiceImpl implements CursosService {
    @Autowired
    private CursosRepository cursosRepository;

    @Override
    @Transactional
    public List<Cursos> findAll() {

        return (List<Cursos>) cursosRepository.findAll();
    }



}
