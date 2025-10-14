package com.jordys.backend.app.backend_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordys.backend.app.backend_app.models.entities.Matricula_e_c;
import com.jordys.backend.app.backend_app.repositories.MatriculaecRepository;

import jakarta.transaction.Transactional;

@Service
public class MatriculaecServiceImpl implements MatriculaecService {
    @Autowired 
    private MatriculaecRepository matriculaecRepository;

    @Override
    @Transactional
    public List<Matricula_e_c> findAll() {
        return (List<Matricula_e_c>) matriculaecRepository.findAll();
    }

}
