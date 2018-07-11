package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel
 */
//@Entity(name = "Denuncia")
//@Table ( name = "Denuncia")
public class Denuncia implements Serializable {

    //@Id
    //@Column (name = "NroDenuncia")
    private int nroDenuncia;

   // private Denunciante denunciante;
   // @Column (name = "tipoDenuncia")
    private String tipoDenuncia;
    //@Column (name = "fecha")
    private LocalDate fecha;
    // @OneToOne(cascade = CascadeType.ALL)
    // @PrimaryKeyJoinColumn
    //private Documentos documentos;
    //   @OneToOne(cascade = CascadeType.ALL)
    // @PrimaryKeyJoinColumn
   // private Mascota mascota;

    public Denuncia() {

    }

    public Denuncia(int nroDenuncia, String tipoDenuncia, LocalDate fecha) {
        this.nroDenuncia = nroDenuncia;
        this.tipoDenuncia = tipoDenuncia;
        this.fecha = fecha;
    }

    public int getNroDenuncia() {
        return nroDenuncia;
    }

    public void setNroDenuncia(int nroDenuncia) {
        this.nroDenuncia = nroDenuncia;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Denuncia{" + "nroDenuncia=" + nroDenuncia + ", tipoDenuncia=" + tipoDenuncia + ", fecha=" + fecha + '}';
    }

   
   

}
