package com.web.app.Service;

import java.util.List;

import com.web.app.model.Boleto;
import com.web.app.model.Transporte;

public interface BoletoService {
     void saveBoleto(Boleto boleto);
    Boleto getBoletoById(Long id);
    List<Boleto> getAllBoletos();
    List<Boleto> getBoletosByTransporte(Transporte transporte);
    void deleteBoleto(Long id);
    Boleto updateBoleto(Boleto boleto);
}
