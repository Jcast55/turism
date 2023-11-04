package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.app.model.Transporte;

public interface TransporteDao extends JpaRepository<Transporte, Long> {
    
}
