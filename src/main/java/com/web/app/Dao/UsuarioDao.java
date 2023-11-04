package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.app.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    
}
