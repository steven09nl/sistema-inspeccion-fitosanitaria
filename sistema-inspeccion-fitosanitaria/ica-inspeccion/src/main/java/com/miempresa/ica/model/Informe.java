package com.miempresa.ica.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "INFORME_FITOSANITARIO")
public class Informe {
    @Id
    @Column(name="ID_INFORME")
    private Long idInforme;

    @Column(name="ID_LOTE")
    private Long idLote;

    @Column(name="FECHA_INSPECCION")
    private java.sql.Date fechaInspeccion;

    @Column(name="OBSERVACION")
    private String observacion;

    @Column(name="CANT_PLANTAS")
    private Integer cantidadPlantas;

    @OneToMany(mappedBy = "informe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePlaga> detalles;

    public Long getIdInforme(){return idInforme;}
    public void setIdInforme(Long id){this.idInforme=id;}
    public Long getIdLote(){return idLote;}
    public void setIdLote(Long id){this.idLote=id;}
    public java.sql.Date getFechaInspeccion(){return fechaInspeccion;}
    public void setFechaInspeccion(java.sql.Date d){this.fechaInspeccion=d;}
    public String getObservacion(){return observacion;}
    public void setObservacion(String s){this.observacion=s;}
    public Integer getCantidadPlantas(){return cantidadPlantas;}
    public void setCantidadPlantas(Integer i){this.cantidadPlantas=i;}
    public List<DetallePlaga> getDetalles(){return detalles;}
    public void setDetalles(List<DetallePlaga> d){this.detalles=d;}
}
