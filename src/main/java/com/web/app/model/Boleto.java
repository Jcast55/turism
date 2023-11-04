package com.web.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Table(name = "boleto")
@Entity
public class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoBoleto;
    private Date fechaHoraSalida;
    private Date fechaHoraLlegada;
    private double precio;

    // Otras propiedades y relaciones
    @ManyToOne
    @JoinColumn(name = "id_transporte")
    private Transporte transporte;

}
