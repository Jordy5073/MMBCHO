package com.jordys.backend.app.backend_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jordys.backend.app.backend_app.models.entities.Usuarios;
import com.jordys.backend.app.backend_app.repositories.UsuarioRepository;


@Service 
public class UsuriosServiceImpl implements UsuariosService { 

    @Autowired
    private UsuarioRepository usuariosRepository;

    @Override
    @Transactional(readOnly = true) // Es buena práctica marcar los 'find' como readOnly
    public List<Usuarios> findAll() {
        return (List<Usuarios>) usuariosRepository.findAll();
    }
    
    @Override
    @Transactional(readOnly = true) // Es buena práctica
    public Optional<Usuarios> findById(long id) {
        return usuariosRepository.findById(id);
    }

    @Override
    @Transactional // Añadido @Transactional
    public Usuarios save(Usuarios user) {
        return usuariosRepository.save(user);
    }

    @Override
    @Transactional // Añadido @Transactional
    public void remove(long id) {
        usuariosRepository.deleteById(id);
    }

    // --- MÉTODO UPDATE CORREGIDO ---
    // La firma coincide con la llamada del Controller: (Usuarios user, Long id)
    @Override
    @Transactional
    public Optional<Usuarios> update(Usuarios user, Long id) {
        // 1. Buscar el usuario por el ID que viene en la URL
        Optional<Usuarios> o = usuariosRepository.findById(id);

        // 2. Si existe, actualizarlo
        if (o.isPresent()) {
            Usuarios usuarioDb = o.get();
            
            // 3. Actualizar los campos con los datos que vienen en el body (objeto "user")
            usuarioDb.setNombre(user.getNombre());
            usuarioDb.setEmail(user.getEmail());
            // (Si tuvieras más campos, como password, irían aquí)
            
            // 4. Guardar en la BD y devolver el usuario actualizado
            return Optional.of(usuariosRepository.save(usuarioDb));
        }
        
        // 5. Si no se encontró el ID, devolver vacío
        return Optional.empty();
    }

    // El otro método "update(long id, Usuarios usuarios)" se eliminó 
    // porque estaba duplicado y causaba el conflicto.
}
