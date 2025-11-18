package com.miempresa.ica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "LOTE")
public class Lote {
    @Id
    @Column(name="ID_LOTE")
    private Long idLote;

    @Column(name="ID_LUGAR")
    private Long idLugar;

    @ManyToOne
    @JoinColumn(name="ID_ESPECIE", referencedColumnName="ID_ESPECIE", insertable=false, updatable=false)
    private Especie especie;

    @Column(name="VARIEDAD")
    private String variedad;

    public Long getIdLote(){return idLote;}
    public void setIdLote(Long id){this.idLote=id;}
    public Long getIdLugar(){return idLugar;}
    public void setIdLugar(Long id){this.idLugar=id;}
    public Especie getEspecie(){return especie;}
    public void setEspecie(Especie e){this.especie=e;}
    public String getVariedad(){return variedad;}
    public void setVariedad(String v){this.variedad=v;}
}
