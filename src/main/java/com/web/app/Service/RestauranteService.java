package com.web.app.Service;

import java.util.List;

import com.web.app.model.Municipio;
import com.web.app.model.Restaurante;

public interface RestauranteService {
    void saveRestaurante(Restaurante restaurante);
    Restaurante getRestauranteById(Long id);
    List<Restaurante> getAllRestaurantes();
    List<Restaurante> getRestaurantesByMunicipio(Municipio municipio);
    void deleteRestaurante(Long id);
    Restaurante updateRestaurante(Restaurante restaurante);
}
