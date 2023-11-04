package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.web.app.model.Boleto;
import com.web.app.model.Transporte;

public interface BoletoDao extends JpaRepository<Boleto, Long> {

    List<Boleto> findAllByTransporte(Transporte transporte);
}
