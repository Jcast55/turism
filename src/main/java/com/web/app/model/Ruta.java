package com.web.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Otras propiedades y relaciones
    @ManyToOne
    @JoinColumn(name = "id_municipio_origen")
    private Municipio origen;

    @ManyToOne
    @JoinColumn(name = "id_municipio_destino")
    private Municipio destino;

    @OneToMany(mappedBy = "ruta")
    private List<Transporte> transportes;
}
