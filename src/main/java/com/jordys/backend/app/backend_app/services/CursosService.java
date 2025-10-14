package com.jordys.backend.app.backend_app.services;

import java.util.List;

import com.jordys.backend.app.backend_app.models.entities.Cursos;

public interface CursosService {

    List<Cursos> findAll();
}
