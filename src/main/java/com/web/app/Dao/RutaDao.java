package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.app.model.Ruta;

public interface RutaDao extends JpaRepository<Ruta, Long> {
    
}
