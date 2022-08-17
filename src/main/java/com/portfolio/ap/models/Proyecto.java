package com.portfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String tituloProyecto;
    private String descripcionProyecto;
    private String urlProyecto;

    public Proyecto(){

    }

    public Proyecto(Long idProyecto, String tituloProyecto, String descripcionProyecto, String urlProyecto) {
        this.idProyecto = idProyecto;
        this.tituloProyecto = tituloProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.urlProyecto = urlProyecto;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getUrlProyecto() {
        return urlProyecto;
    }

    public void setUrlProyecto(String urlProyecto) {
        this.urlProyecto = urlProyecto;
    }
}
