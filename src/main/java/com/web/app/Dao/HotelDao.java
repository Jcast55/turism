package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.web.app.model.Hotel;
import com.web.app.model.Municipio;

public interface HotelDao extends JpaRepository<Hotel, Long> {
        List<Hotel> findAllByMunicipio(Municipio municipio);
}
