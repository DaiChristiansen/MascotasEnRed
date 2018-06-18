package com.unb001.mascotasenred.modelo;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel
 */
public class Denuncia {

    private int dni;
    private String tipodedenuncia;
    private Date fecha;

    public Denuncia(int dni, String tipodenuncia, Date fecha) {
        this.dni = dni;
        this.tipodedenuncia = tipodenuncia;
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTipoDeDenuncia() {
        return tipodedenuncia;
    }

    public void setTipoDeDenuncia(String tipodedenuncia) {
        this.tipodedenuncia = tipodedenuncia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
