package com.portfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExperiencia;
    private String nombreEmpresa;
    private String puesto;
    private String tipoEmpleo;
    private String fechaInicio;
    private String  fechaFin;


    public Experiencia() {

    }

    public Experiencia(Long idExperiencia, String nombreEmpresa, String puesto, String tipoEmpleo, String fechaInicio, String fechaFin) {
        this.idExperiencia = idExperiencia;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.tipoEmpleo = tipoEmpleo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(Long idExperiencia) {
        this.idExperiencia = idExperiencia;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTipoEmpleo() {
        return tipoEmpleo;
    }

    public void setTipoEmpleo(String tipoEmpleo) {
        this.tipoEmpleo = tipoEmpleo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}

