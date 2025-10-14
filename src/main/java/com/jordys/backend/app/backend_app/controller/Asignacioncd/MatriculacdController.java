package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordys.backend.app.backend_app.models.entities.Matricula_e_c;
import com.jordys.backend.app.backend_app.services.MatriculaecService;

@Controller
@RequestMapping("/api/matriculacd")
public class MatriculacdController {
    @Autowired
    private MatriculaecService matriculacdService;

    public List<Matricula_e_c> list() {
        return matriculacdService.findAll();
    }

}
