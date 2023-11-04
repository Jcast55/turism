package com.web.app.Service;

import java.util.List;

import com.web.app.model.Ruta;

public interface RutaService {
    void saveRuta(Ruta ruta);

    Ruta getRutaById(Long id);

    List<Ruta> getAllRutas();

    void deleteRuta(Long id);

    Ruta updateRuta(Ruta ruta);
}
