package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.web.app.model.Departamento;
import com.web.app.model.Municipio;

public interface MunicipioDao extends JpaRepository<Municipio, Long> {
        List<Municipio> findAllByDepartamento(Departamento departamento);
}
