package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordys.backend.app.backend_app.models.entities.Usuarios;
import com.jordys.backend.app.backend_app.services.UsuariosService;

@Controller
@RequestMapping("/api/usuarios")
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    public List<Usuarios> list() {
        return usuariosService.findAll();
    }

}
