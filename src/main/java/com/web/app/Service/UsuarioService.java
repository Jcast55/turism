package com.web.app.Service;

import java.util.List;
import com.web.app.model.Usuario;

public interface UsuarioService {

    void saveUsuario(Usuario usuario);

    Usuario getUsuarioById(Long id);

    List<Usuario> getAllUsuarios();

    void deleteUsuario(Long id);

    Usuario updateUsuario(Usuario usuario);
}
