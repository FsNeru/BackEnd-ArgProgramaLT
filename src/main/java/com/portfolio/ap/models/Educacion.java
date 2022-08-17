package com.portfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEducacion;
    private String tituloEstudio;
    private String institucionEstudio;
    private String fechaInicio;
    private String fechaFin;

    public Educacion() {
    }

    public Educacion(Long idEducacion, String tituloEstudio, String institucionEstudio, String fechaInicio, String fechaFin) {
        this.idEducacion = idEducacion;
        this.tituloEstudio = tituloEstudio;
        this.institucionEstudio = institucionEstudio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(Long idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getTituloEstudio() {
        return tituloEstudio;
    }

    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }

    public String getInstitucionEstudio() {
        return institucionEstudio;
    }

    public void setInstitucionEstudio(String institucionEstudio) {
        this.institucionEstudio = institucionEstudio;
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


