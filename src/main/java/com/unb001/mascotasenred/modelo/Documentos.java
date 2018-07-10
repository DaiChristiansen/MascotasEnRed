package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
//@Entity(name = "comprobante")
public class Documentos implements Serializable {

    // @Id
    private int nro; //nro autoincremento
    //private Denunciante denunciante;
    private int tipoComprobante; // 1, 2, depende el nombre del documento
    private String nombreComprobante; // perdido, encontrado, en adopcion o registrado
    // @ManyToOne
    //@PrimaryKeyJoinColumn
   // private Denunciante denunciante;
    //@OneToOne(cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    //private Denuncia denuncia;

    public Documentos() {
    }

    public Documentos(int nro, int tipoComprobante, String nombreComprobante) {
        this.nro = nro;
        this.tipoComprobante = tipoComprobante;
        this.nombreComprobante = nombreComprobante;

    }

    public int getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(int tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getNombreComprobante() {
        return nombreComprobante;
    }

    public void setNombreComprobante(String nombreComprobante) {
        this.nombreComprobante = nombreComprobante;
    }

    public float getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Documentos{" + "nro=" + nro + ", tipoComprobante=" + tipoComprobante + ", nombreComprobante=" + nombreComprobante + ", denunciante=" + denunciante + ", denuncia=" + denuncia + '}';
    }

}
