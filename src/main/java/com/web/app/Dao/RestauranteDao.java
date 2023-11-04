package com.web.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.app.model.Municipio;
import com.web.app.model.Restaurante;

public interface RestauranteDao extends JpaRepository<Restaurante, Long> {
        List<Restaurante> findAllByUbicacion(Municipio municipio);
}
