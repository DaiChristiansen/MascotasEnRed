package com.unb001.mascotasenred.modelo;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel
 */
//@Entity (name="Telefono")
public class Telefono implements Serializable {

    //@Id
    private int idTelefono;
    private int area;
    private int nro;
    private String tipo;
    //@ManyToOne
    //@PrimaryKeyJoinColumn
   private Denunciante denunciante;

    public Telefono() {

    }

    public Telefono(int idTelefono, int area, int telefono, String tipo) {
        this.idTelefono = idTelefono;
        this.area = area;
        this.nro = telefono;
        this.tipo = tipo;
    }

  

      public int getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(int idTelefono) {
        this.idTelefono = idTelefono;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int telefono) {
        this.nro = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Denunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }

    @Override
    public String toString() {
        return "Telefono{" + "idTelefono=" + idTelefono + ", area=" + area + ", telefono=" + nro + ", tipo=" + tipo + '}';
    }

  
  

}
