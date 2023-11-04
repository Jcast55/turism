package com.web.app;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.web.app.Service.UsuarioService;
import com.web.app.model.Usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class UsuarioServiceImplTest {



    @Autowired
    private UsuarioService usuarioService;

    @Test
    public void testGuardarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("usuarioEjemplo");
        usuario.setContrasena("contrasenaEjemplo");
        usuario.setCorreoElectronico("ejemplo@example.com");
        usuarioService.saveUsuario(usuario);
        assertNotNull(usuario.getId());
    }

    @Test
    public void testActualizarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("usuarioEjemplo");
        usuario.setContrasena("contrasenaEjemplo");
        usuario.setCorreoElectronico("ejemplo@example.com");
        usuarioService.saveUsuario(usuario);

        // Modificar el objeto (por ejemplo, cambiar el nombre de usuario)
        usuario.setNombreUsuario("nuevoNombreUsuario");
        usuarioService.updateUsuario(usuario);

        Usuario usuarioActualizado = usuarioService.getUsuarioById(usuario.getId());
        assertEquals("nuevoNombreUsuario", usuarioActualizado.getNombreUsuario());
    }

    @Test
    public void testEliminarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("eliminarUsuario");
        usuario.setContrasena("contrasenaEliminar");
        usuario.setCorreoElectronico("eliminar@example.com");
        usuarioService.saveUsuario(usuario);

        Long usuarioId = usuario.getId();

        usuarioService.deleteUsuario(usuarioId);

        Usuario usuarioEliminado = usuarioService.getUsuarioById(usuarioId);
        assertNull(usuarioEliminado);
    }
}

