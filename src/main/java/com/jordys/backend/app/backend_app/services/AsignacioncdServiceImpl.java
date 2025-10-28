package com.jordys.backend.app.backend_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jordys.backend.app.backend_app.models.entities.Asignacion_c_d;
import com.jordys.backend.app.backend_app.repositories.AsignacioncdRespository;

import jakarta.transaction.Transactional;

@Service
public class AsignacioncdServiceImpl implements AsignacioncdService{
    @Autowired
    private AsignacioncdRespository asignacioncdRespository;

    @Override
    @Transactional
    public List<Asignacion_c_d> findAll() {

        return (List<Asignacion_c_d>) asignacioncdRespository.findAll();
    }

}
