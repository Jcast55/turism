package com.web.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "transporte")
@Data
public class Transporte {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;

  // Otras propiedades y relaciones
  @ManyToOne
  @JoinColumn(name = "id_Ruta")
  private Ruta ruta;

}
