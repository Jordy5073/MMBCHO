package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordys.backend.app.backend_app.models.entities.Asignacion_c_d;
import com.jordys.backend.app.backend_app.services.AsignacioncdService;

@Controller
@RequestMapping("/api/asignacioncd")
public class AsignacioncdController {   
    @Autowired
    private AsignacioncdService asignacioncdService;

    public List<Asignacion_c_d> list() {
        return asignacioncdService.findAll();
    }


}
