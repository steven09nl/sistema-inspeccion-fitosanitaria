package com.miempresa.ica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PLAGA")
public class Plaga {
    @Id
    @Column(name="ID_PLAGA")
    private Long idPlaga;

    @Column(name="NOMBRE_CIENTIFICO")
    private String nombreCientifico;

    @Column(name="NOMBRES_COMUNES")
    private String nombresComunes;

    public Long getIdPlaga(){return idPlaga;}
    public void setIdPlaga(Long id){this.idPlaga=id;}
    public String getNombreCientifico(){return nombreCientifico;}
    public void setNombreCientifico(String s){this.nombreCientifico=s;}
    public String getNombresComunes(){return nombresComunes;}
    public void setNombresComunes(String s){this.nombresComunes=s;}
}
