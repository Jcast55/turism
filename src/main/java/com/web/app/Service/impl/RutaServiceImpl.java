package com.web.app.Service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Dao.RutaDao;
import com.web.app.Service.RutaService;
import com.web.app.model.Ruta;

import java.util.List;

@Service
public class RutaServiceImpl implements RutaService {

    @Autowired
    private RutaDao rutaDAO;

    @Override
    public void saveRuta(Ruta ruta) {
        rutaDAO.save(ruta);
    }

    @Override
    public Ruta getRutaById(Long id) {
        return rutaDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Ruta> getAllRutas() {
        return rutaDAO.findAll();
    }

    @Override
    public void deleteRuta(Long id) {
        rutaDAO.deleteById(id);
    }

    @Override
    public Ruta updateRuta(Ruta ruta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateRuta'");
    }

  
}
