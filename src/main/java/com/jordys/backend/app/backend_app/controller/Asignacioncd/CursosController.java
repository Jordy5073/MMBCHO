package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordys.backend.app.backend_app.models.entities.Cursos;
import com.jordys.backend.app.backend_app.services.CursosService;

@Controller
@RequestMapping("/api/cursos")
public class CursosController {
    @Autowired
    private CursosService cursosService;    
     public List<Cursos> list() {
        return cursosService.findAll();
    }

}
