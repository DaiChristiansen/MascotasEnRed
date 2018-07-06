package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel
 */
//@Entity(name = "denuncia")
public class Denuncia implements Serializable {

    //  @Id
    private int nroDenuncia;

    public void setNroDenuncia(int nroDenuncia) {
        this.nroDenuncia = nroDenuncia;
    }

    public int getNroDenuncia() {
        return nroDenuncia;
    }
    //private Denunciante denunciante;
    private String tipoDenuncia;
    private Date fecha;
    // @OneToOne(cascade = CascadeType.ALL)
    // @PrimaryKeyJoinColumn
    private Documentos documentos;
    //   @OneToOne(cascade = CascadeType.ALL)
    // @PrimaryKeyJoinColumn
    private Mascota mascota;

    public Denuncia() {

    }

    public Denuncia(int nroDenuncia, String tipoDenuncia, Date fecha) {
        this.nroDenuncia = nroDenuncia;
        this.tipoDenuncia = tipoDenuncia;
        this.fecha = fecha;
    }

    public String getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(String tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
