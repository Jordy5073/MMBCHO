package com.jordys.backend.app.backend_app.controller.Asignacioncd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jordys.backend.app.backend_app.models.entities.Usuarios;
import com.jordys.backend.app.backend_app.services.UsuariosService;

@RestController
@RequestMapping("/api/usuarios") // <-- CAMBIO 1: Pon la ruta base completa aquí
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    // ✅ Listar todos: GET /api/usuarios
    @GetMapping
    public List<Usuarios> list() {
        return usuariosService.findAll();
    }

    // ✅ Buscar usuario por ID: GET /api/usuarios/{id}
    @GetMapping("/{id}")
    public ResponseEntity<?> showOne(@PathVariable Long id) {
      Optional<Usuarios> usuarioOptional = usuariosService.findById(id);

      if (usuarioOptional.isPresent()) {
        return ResponseEntity.ok(usuarioOptional.get());
      } else {
        return ResponseEntity.notFound().build();
      }
    }
    
    // ✅ Crear usuario: POST /api/usuarios
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createUser(@RequestBody Usuarios usuarios) { // (Aquí ya tenías @RequestBody, ¡bien!)
      Usuarios usuariosDb = usuariosService.save(usuarios);
      return ResponseEntity.status(HttpStatus.CREATED).body(usuariosDb);
    }
    
    // ✅ Actualizar usuario: PUT /api/usuarios/{id}
    @PutMapping("/{id}") // <-- CAMBIO 2: La ruta ahora solo es "/{id}"
    public ResponseEntity<?> update(@RequestBody Usuarios usuarios, @PathVariable long id) { // <-- CAMBIO 3: Añade @RequestBody
      Optional<Usuarios> o = usuariosService.update(usuarios, id);
      if (o.isPresent()) {
        // Es mejor devolver HttpStatus.OK (200) o HttpStatus.CREATED (201) al actualizar
        return ResponseEntity.ok(o.get());
      }
      return ResponseEntity.notFound().build();
    }

}
