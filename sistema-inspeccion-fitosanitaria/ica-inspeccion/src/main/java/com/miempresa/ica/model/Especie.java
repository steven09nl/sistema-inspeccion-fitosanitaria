package com.miempresa.ica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ESPECIE")
public class Especie {
    @Id
    @Column(name="ID_ESPECIE")
    private Long idEspecie;

    @Column(name="NOMBRE_CIENTIFICO")
    private String nombreCientifico;

    @Column(name="NOMBRE_COMUN")
    private String nombreComun;

    public Long getIdEspecie(){return idEspecie;}
    public void setIdEspecie(Long id){this.idEspecie=id;}
    public String getNombreCientifico(){return nombreCientifico;}
    public void setNombreCientifico(String s){this.nombreCientifico=s;}
    public String getNombreComun(){return nombreComun;}
    public void setNombreComun(String s){this.nombreComun=s;}
}
