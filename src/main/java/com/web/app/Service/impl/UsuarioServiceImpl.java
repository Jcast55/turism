package com.web.app.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Service.UsuarioService;
import com.web.app.model.Usuario;
import com.web.app.Dao.UsuarioDao;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioDao usuarioDAO;

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioDAO.save(usuario);
    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return usuarioDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        if (usuario.getId() == null) {
            // El usuario no existe en la base de datos, por lo que no se puede actualizar
            return null;
        }

        Usuario usuarioExistente = usuarioDAO.findById(usuario.getId()).orElse(null);
        if (usuarioExistente == null) {
            // El usuario no se encuentra en la base de datos
            return null;
        }

        // Realiza la lógica para actualizar el usuario
        usuarioExistente.setNombreUsuario(usuario.getNombreUsuario());
        usuarioExistente.setContrasena(usuario.getContrasena());
        usuarioExistente.setCorreoElectronico(usuario.getCorreoElectronico());
        // Actualiza otras propiedades según sea necesario

        // Guarda el usuario actualizado en la base de datos
        return usuarioDAO.save(usuarioExistente);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioDAO.deleteById(id);
    }

}
