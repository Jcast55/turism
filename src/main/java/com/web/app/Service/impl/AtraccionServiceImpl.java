package com.web.app.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Service.AtraccionService;
import com.web.app.model.Atraccion;
import com.web.app.model.Municipio;
import com.web.app.Dao.AtraccionDao;

@Service
public class AtraccionServiceImpl implements AtraccionService {

    @Autowired
    private AtraccionDao atraccionDAO;

    @Override
    public void saveAtraccion(Atraccion atraccion) {
        atraccionDAO.save(atraccion);
    }

    @Override
    public Atraccion getAtraccionById(Long id) {
        return atraccionDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Atraccion> getAllAtracciones() {
        return atraccionDAO.findAll();
    }

    @Override
    public List<Atraccion> getAtraccionesByMunicipio(Municipio municipio) {
        return atraccionDAO.findAllByUbicacion(municipio);
    }

    @Override
    public void deleteAtraccion(Long id) {
        atraccionDAO.deleteById(id);
    }

    @Override
    public Atraccion updateAtraccion(Atraccion atraccion) {
        if (atraccion.getId() == null) {
            // La atracción no existe en la base de datos, por lo que no se puede actualizar
            return null;
        }

        Atraccion atraccionExistente = atraccionDAO.findById(atraccion.getId()).orElse(null);
        if (atraccionExistente == null) {
            // La atracción no se encuentra en la base de datos
            return null;
        }

        // Realiza la lógica para actualizar la atracción
        atraccionExistente.setNombre(atraccion.getNombre());
        atraccionExistente.setUbicacion(atraccion.getUbicacion());
        // Actualiza otras propiedades según sea necesario

        // Guarda la atracción actualizada en la base de datos
        return atraccionDAO.save(atraccionExistente);
    }

}
