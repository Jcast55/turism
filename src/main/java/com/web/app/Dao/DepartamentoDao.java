package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.app.model.Departamento;

public interface DepartamentoDao extends JpaRepository<Departamento, Long>{
    
}
