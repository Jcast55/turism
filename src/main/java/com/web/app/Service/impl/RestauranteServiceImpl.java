package com.web.app.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.web.app.Dao.RestauranteDao;
import com.web.app.Service.RestauranteService;
import com.web.app.model.Municipio;
import com.web.app.model.Restaurante;

@Service
public class RestauranteServiceImpl implements RestauranteService{
    
    @Autowired
    private RestauranteDao restauranteDAO;

    @Override
    public void saveRestaurante(Restaurante restaurante) {
        restauranteDAO.save(restaurante);
    }

    @Override
    public Restaurante getRestauranteById(Long id) {
        return restauranteDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Restaurante> getAllRestaurantes() {
        return restauranteDAO.findAll();
    }

    @Override
    public List<Restaurante> getRestaurantesByMunicipio(Municipio municipio) {
        return restauranteDAO.findAllByUbicacion(municipio);
    }

    @Override
    public void deleteRestaurante(Long id) {
        restauranteDAO.deleteById(id);
    }

    @Override
    public Restaurante updateRestaurante(Restaurante restaurante) {
        // Realiza la lógica para actualizar el restaurante según tus necesidades
        // Puede ser necesario obtener el restaurante existente por ID y actualizar sus atributos
        // Luego, guarda el restaurante actualizado en la base de datos
        return restauranteDAO.save(restaurante);
    }
}
