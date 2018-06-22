package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Entity (name="Telefono")
    public class Telefono implements Serializable {
    @Id
    private int idTelefono;
    private int area;
    private int telefono;
    private String tipo;
    @ManyToOne
    @PrimaryKeyJoinColumn
    private Denunciante denunciante;
    
    public Telefono(){
        
    }
    
public Telefono (int idTelefono, int area, int telefono, String tipo) {
    this.idTelefono=idTelefono;
    this.area=area;
    this.telefono=telefono;
    this.tipo=tipo;
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

