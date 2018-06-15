package com.unb001.mascotasenred.modelo;

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
    private float dni;
    private String tipodedenuncia;
    private float fecha;

    public Denuncia(float dni, String tipo, float fecha) {
        this.dni = dni;
        this.tipodedenuncia = tipodedenuncia;
        this.fecha = fecha;
    }

    public float getDni() {
        return dni;
    }

    public void setDni(float dni) {
        this.dni = dni;
    }

    public String getTipoDeDenuncia() {
        return tipodedenuncia;
    }

    public void setTipoDeDenuncia(String tipodedenuncia) {
        this.tipodedenuncia = tipodedenuncia;
    }

    public float getFecha() {
        return fecha;
    }

    public void setFecha(float fecha) {
        this.fecha = fecha;
    }
    
}
