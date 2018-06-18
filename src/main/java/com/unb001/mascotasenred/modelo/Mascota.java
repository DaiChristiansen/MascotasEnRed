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
public class Mascota {
    private Denunciante denunciante;
    private String nombre;
    private String tipo; // perro, gato, tortuga, etc.
    private String raza;
    private String color;
    private String caracteristica_especiales;
    private String tamanio;
    private String zona;
    private String estado; //perdido, encontrado, en adopcion o registrado

    public Mascota(Denunciante denunciante, String nombre, String tipo, String raza, String color, String caracteristica_especiales, String tamanio, String zona, String estado) {
        this.denunciante=denunciante;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.caracteristica_especiales = caracteristica_especiales;
        this.tamanio = tamanio;
        this.zona = zona;
        this.estado = estado;
    }
    
    public Mascota(Denunciante denunciante,String tipo, String raza, String color, String caracteristica_especiales, String tamanio, String zona, String estado) {
        this.denunciante=denunciante;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.caracteristica_especiales = caracteristica_especiales;
        this.tamanio = tamanio;
        this.zona = zona;
        this.estado = estado;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getCaracteristica_especiales() {
        return caracteristica_especiales;
    }

    public void setCaracteristica_especiales(String caracteristica_especiales) {
        this.caracteristica_especiales = caracteristica_especiales;
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
    
   
    
}
