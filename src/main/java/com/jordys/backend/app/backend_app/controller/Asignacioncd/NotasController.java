package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordys.backend.app.backend_app.models.entities.Notas;
import com.jordys.backend.app.backend_app.services.NotasService;

@Controller
@RequestMapping("/api/notas")
public class NotasController {
    @Autowired
    private NotasService notasService;

    public List<Notas> list() {
        return notasService.findAll();
    }

}
