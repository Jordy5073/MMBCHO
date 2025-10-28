package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jordys.backend.app.backend_app.models.entities.Roles;
import com.jordys.backend.app.backend_app.services.RolesService;

@Controller
@RequestMapping("/api/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    public List<Roles> list() {
        return rolesService.findAll();
    }

}
