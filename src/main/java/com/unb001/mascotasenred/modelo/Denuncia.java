package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Entity(name = "denuncia")
public class Denuncia implements Serializable {

    @Id
    private int nroDenuncia;
    //private Denunciante denunciante;
    private String tipoDenuncia;
    private Date fecha;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Documentos documentos;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
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
