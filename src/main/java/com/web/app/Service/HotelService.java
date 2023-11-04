package com.web.app.Service;

import java.util.List;

import com.web.app.model.Hotel;
import com.web.app.model.Municipio;

public interface HotelService {
    void saveHotel(Hotel hotel);
    Hotel getHotelById(Long id);
    List<Hotel> getAllHoteles();
    List<Hotel> getHotelesByMunicipio(Municipio municipio);
    void deleteHotel(Long id);
    Hotel updateHotel(Hotel hotel);
}
