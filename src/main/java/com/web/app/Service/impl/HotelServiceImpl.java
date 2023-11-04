package com.web.app.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.web.app.Dao.HotelDao;
import com.web.app.Service.HotelService;
import com.web.app.model.Hotel;
import com.web.app.model.Municipio;

@Service
public class HotelServiceImpl implements HotelService {
    
    @Autowired
    private HotelDao hotelDAO;

    @Override
    public void saveHotel(Hotel hotel) {
        hotelDAO.save(hotel);
    }

    @Override
    public Hotel getHotelById(Long id) {
        return hotelDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Hotel> getAllHoteles() {
        return hotelDAO.findAll();
    }

    @Override
    public List<Hotel> getHotelesByMunicipio(Municipio municipio) {
        return hotelDAO.findAllByMunicipio(municipio);
    }

    @Override
    public void deleteHotel(Long id) {
        hotelDAO.deleteById(id);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        // Realiza la lógica para actualizar el hotel según tus necesidades
        // Puede ser necesario obtener el hotel existente por ID y actualizar sus atributos
        // Luego, guarda el hotel actualizado en la base de datos
        return hotelDAO.save(hotel);
    }
}
