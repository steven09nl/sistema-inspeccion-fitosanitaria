package com.miempresa.ica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "LUGAR_PRODUCCION")
public class LugarProduccion {
    @Id
    @Column(name="ID_LUGAR")
    private Long idLugar;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="DEPARTAMENTO")
    private String departamento;

    @Column(name="MUNICIPIO")
    private String municipio;

    @Column(name="ID_PREDIO")
    private Long idPredio;

    public Long getIdLugar(){return idLugar;}
    public void setIdLugar(Long id){this.idLugar=id;}
    public String getNombre(){return nombre;}
    public void setNombre(String n){this.nombre=n;}
    public String getDepartamento(){return departamento;}
    public void setDepartamento(String s){this.departamento=s;}
    public String getMunicipio(){return municipio;}
    public void setMunicipio(String s){this.municipio=s;}
    public Long getIdPredio(){return idPredio;}
    public void setIdPredio(Long id){this.idPredio=id;}
}
