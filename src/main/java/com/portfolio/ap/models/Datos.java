package com.portfolio.ap.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Datos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String profesionUsuario;
    private String domicilioUsuario;
    private String sobreMiUsuario;
    private String urlFotoUsuario;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducacion")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperiencia")
    private List<Experiencia> experienciaListList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillListList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyecto")
    private List<Proyecto> proyectoList;

    public Datos(){

    }

    public Datos(Long id, String nombreUsuario, String apellidoUsuario, String profesionUsuario, String domicilioUsuario, String sobreMiUsuario, String urlFotoUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.profesionUsuario = profesionUsuario;
        this.domicilioUsuario = domicilioUsuario;
        this.sobreMiUsuario = sobreMiUsuario;
        this.urlFotoUsuario = urlFotoUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getProfesionUsuario() {
        return profesionUsuario;
    }

    public void setProfesionUsuario(String profesionUsuario) {
        this.profesionUsuario = profesionUsuario;
    }

    public String getDomicilioUsuario() {
        return domicilioUsuario;
    }

    public void setDomicilioUsuario(String domicilioUsuario) {
        this.domicilioUsuario = domicilioUsuario;
    }

    public String getSobreMiUsuario() {
        return sobreMiUsuario;
    }

    public void setSobreMiUsuario(String sobreMiUsuario) {
        this.sobreMiUsuario = sobreMiUsuario;
    }

    public String getUrlFotoUsuario() {
        return urlFotoUsuario;
    }

    public void setUrlFotoUsuario(String urlFotoUsuario) {
        this.urlFotoUsuario = urlFotoUsuario;
    }
}
