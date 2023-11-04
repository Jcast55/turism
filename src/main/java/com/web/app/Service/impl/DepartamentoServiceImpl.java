package com.web.app.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Dao.DepartamentoDao;
import com.web.app.Service.DepartamentoService;
import com.web.app.model.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
    @Autowired
    private DepartamentoDao departamentoDAO;

    @Override
    public void saveDepartamento(Departamento departamento) {
        departamentoDAO.save(departamento);
    }

    @Override
    public Departamento getDepartamentoById(Long id) {
        return departamentoDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Departamento> getAllDepartamentos() {
        return departamentoDAO.findAll();
    }

    @Override
    public void deleteDepartamento(Long id) {
        departamentoDAO.deleteById(id);
    }

    @Override
    public Departamento updateDepartamento(Departamento departamento) {
        /* 
        *  
        */
        return departamentoDAO.save(departamento);
    }
}
