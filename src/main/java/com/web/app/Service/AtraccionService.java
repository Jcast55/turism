package com.web.app.Service;

import com.web.app.model.Atraccion;
import com.web.app.model.Municipio;

import java.util.List;

public interface AtraccionService {
    void saveAtraccion(Atraccion atraccion);

    Atraccion getAtraccionById(Long id);

    List<Atraccion> getAllAtracciones();

    List<Atraccion> getAtraccionesByMunicipio(Municipio municipio);

    void deleteAtraccion(Long id);

    Atraccion updateAtraccion(Atraccion atraccion);

}
