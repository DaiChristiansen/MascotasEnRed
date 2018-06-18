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
public class Documentos {
    private Denunciante denunciante;
    private int tipo; // 1, 2, depende el nombre del documento
    private String nombre; // perdido, encontrado, en adopcion o registrado
    private int nro; //nro autoincremento

    public Documentos(Denunciante denunciante, int tipo, String nombre, int nro) {
        this.denunciante = denunciante;
        this.tipo = tipo;
        this.nombre = nombre;
        this.nro = nro;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
}
