package com.web.app.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Dao.MunicipioDao;
import com.web.app.Service.MunicipioService;
import com.web.app.model.Departamento;
import com.web.app.model.Municipio;

@Service
public class MunicipioServiceImpl implements MunicipioService {
    
    @Autowired
    private MunicipioDao municipioDAO;

    @Override
    public void saveMunicipio(Municipio municipio) {
        municipioDAO.save(municipio);
    }

    @Override
    public Municipio getMunicipioById(Long id) {
        return municipioDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Municipio> getAllMunicipios() {
        return municipioDAO.findAll();
    }

    @Override
    public List<Municipio> getMunicipiosByDepartamento(Departamento departamento) {
        return municipioDAO.findAllByDepartamento(departamento);
    }

    @Override
    public void deleteMunicipio(Long id) {
        municipioDAO.deleteById(id);
    }

    @Override
    public Municipio updateMunicipio(Municipio municipio) {
        /*
         * 
         */
        return municipioDAO.save(municipio);
    }
}
