package com.miempresa.ica.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "DETALLE_INFORME_PLAGA")
public class DetallePlaga {
    @Id
    @Column(name="ID_DETALLE")
    private Long idDetalle;

    @Column(name="ID_INFORME")
    private Long idInforme;

    @Column(name="ID_PLAGA")
    private Long idPlaga;

    @Column(name="PLANTAS_INFECTADAS")
    private Integer plantasInfectadas;

    @Column(name="PORCENTAJE_INFESTACION")
    private BigDecimal porcentaje;

    @ManyToOne
    @JoinColumn(name="ID_INFORME", insertable=false, updatable=false)
    private Informe informe;

    @ManyToOne
    @JoinColumn(name="ID_PLAGA", insertable=false, updatable=false)
    private Plaga plaga;

    public Long getIdDetalle(){return idDetalle;}
    public void setIdDetalle(Long id){this.idDetalle=id;}
    public Long getIdInforme(){return idInforme;}
    public void setIdInforme(Long id){this.idInforme=id;}
    public Long getIdPlaga(){return idPlaga;}
    public void setIdPlaga(Long id){this.idPlaga=id;}
    public Integer getPlantasInfectadas(){return plantasInfectadas;}
    public void setPlantasInfectadas(Integer i){this.plantasInfectadas=i;}
    public BigDecimal getPorcentaje(){return porcentaje;}
    public void setPorcentaje(BigDecimal b){this.porcentaje=b;}
    public Informe getInforme(){return informe;}
    public void setInforme(Informe i){this.informe=i;}
    public Plaga getPlaga(){return plaga;}
    public void setPlaga(Plaga p){this.plaga=p;}
}
