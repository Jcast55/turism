package com.web.app.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.app.Service.BoletoService;
import com.web.app.model.Transporte;
import com.web.app.Dao.BoletoDao;
import com.web.app.model.Boleto;

@Service
public class BoletoServiceImpl implements BoletoService {

    @Autowired
    private BoletoDao boletoDAO;

    @Override
    public void saveBoleto(Boleto boleto) {
        boletoDAO.save(boleto);
    }

    @Override
    public Boleto getBoletoById(Long id) {
        return boletoDAO.findById(id).orElse(null); // Manejo de posibles excepciones
    }

    @Override
    public List<Boleto> getAllBoletos() {
        return boletoDAO.findAll();
    }

    @Override
    public List<Boleto> getBoletosByTransporte(Transporte transporte) {
        return boletoDAO.findAllByTransporte(transporte);
    }

    
    @Override
    public void deleteBoleto(Long id) {
        boletoDAO.deleteById(id);
    }

    @Override
    public Boleto updateBoleto(Boleto boleto) {
        if (boleto.getId() == null) {
            // El boleto no existe en la base de datos, por lo que no se puede actualizar
            return null;
        }

        Boleto boletoExistente = boletoDAO.findById(boleto.getId()).orElse(null);
        if (boletoExistente == null) {
            // El boleto no se encuentra en la base de datos
            return null;
        }

        // Realiza la lógica para actualizar el boleto
        boletoExistente.setPrecio(boleto.getPrecio());
        // Actualiza otras propiedades según sea necesario

        // Guarda el boleto actualizado en la base de datos
        return boletoDAO.save(boletoExistente);
    }
}
