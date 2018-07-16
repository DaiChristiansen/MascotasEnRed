package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
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
//@Entity (name="Mascota")
public class Mascota implements Serializable {
      //@Id

    private int idMascota;  
    private String nombre;
    private String tipoMascota; // perro, gato, tortuga, etc.
    private String raza;
    private String color;
    private String caracteristicasEspeciales;
    private String tamanio;
    private String zona;
    private String estado; //perdido, encontrado, en adopcion o registrado
    private Denunciante denunciante;
    private Denuncia denuncia;
       

    public Mascota() {
    }


    public Mascota(int idMascota, String nombre, String tipoMascota, String raza, String color, String caracteristicasEspeciales, String tamanio, String zona, String estado) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.raza = raza;
        this.color = color;
        this.caracteristicasEspeciales = caracteristicasEspeciales;
        this.tamanio = tamanio;
        this.zona = zona;
        this.estado = estado;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    

   public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public int getIdMascota() {
        return idMascota;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCaracteristicasEspeciales() {
        return caracteristicasEspeciales;
    }

    public void setCaracteristicasEspeciales(String caracteristicasEspeciales) {
        this.caracteristicasEspeciales = caracteristicasEspeciales;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Denunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }

    @Override
    public String toString() {
        return "Mascota{" + "idMascota=" + idMascota + ", nombre=" + nombre + ", tipoMascota=" + tipoMascota + ", raza=" + raza + ", color=" + color + ", caracteristicasEspeciales=" + caracteristicasEspeciales + ", tamanio=" + tamanio + ", zona=" + zona + ", estado=" + estado + ", denunciante=" + denunciante + '}';
    }

   

    

}
