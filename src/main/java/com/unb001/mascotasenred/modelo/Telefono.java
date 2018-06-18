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
public class Telefono {
    private Denunciante denunciante;
    private int area;
    private int telefono;
    private String tipo;
    
public Telefono (Denunciante denunciante, int area, int telefono, String tipo) {
    this.denunciante= denunciante;
    this.area=area;
    this.telefono=telefono;
    this.tipo=tipo;
}

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
