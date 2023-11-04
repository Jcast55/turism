package com.web.app.Service;

import java.util.List;

import com.web.app.model.Departamento;

public interface DepartamentoService {

    void saveDepartamento(Departamento departamento);

    Departamento getDepartamentoById(Long id);

    List<Departamento> getAllDepartamentos();

    void deleteDepartamento(Long id);

    Departamento updateDepartamento(Departamento departamento);
}
