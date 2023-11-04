package com.web.app.Service;

import java.util.List;

import com.web.app.model.Departamento;
import com.web.app.model.Municipio;

public interface MunicipioService {
     void saveMunicipio(Municipio municipio);
    Municipio getMunicipioById(Long id);
    List<Municipio> getAllMunicipios();
    List<Municipio> getMunicipiosByDepartamento(Departamento departamento);
    void deleteMunicipio(Long id);
    Municipio updateMunicipio(Municipio municipio);
    // Otros métodos personalizados si es necesario
}
