package com.portfolio.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private Integer valor;

    public Skill(){

    }

    public Skill(Long idSkill, String nombreSkill, Integer valor) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.valor = valor;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
