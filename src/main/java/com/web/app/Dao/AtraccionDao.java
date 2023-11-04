package com.web.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.app.model.Atraccion;
import com.web.app.model.Municipio;

public interface AtraccionDao extends JpaRepository<Atraccion, Long>  {

    List<Atraccion> findAllByUbicacion(Municipio municipio);
    
}
