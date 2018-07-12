package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


//@Entity(name = "comprobante")
public class Comprobante implements Serializable {
    // @Id
    private int nroComprobante; //nro autoincremento    
    private int tipoComprobante; // 1, 2, depende el nombre del documento
    private String nombreComprobante; // perdido, encontrado, en adopcion o registrado
    // @ManyToOne
    //@PrimaryKeyJoinColumn
    private Denunciante denunciante;
    //@OneToOne(cascade = CascadeType.ALL)
    //@PrimaryKeyJoinColumn
    private Denuncia denuncia;

    public Comprobante() {
    }

    public Comprobante(int nroComprobante, int tipoComprobante, String nombreComprobante) {
        this.nroComprobante = nroComprobante;
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

    public int getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(int nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public Denunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    @Override
    public String toString() {
        return "Comprobante{" + "nroComprobante=" + nroComprobante + ", tipoComprobante=" + tipoComprobante + ", nombreComprobante=" + nombreComprobante + ", denunciante=" + denunciante + ", denuncia=" + denuncia + '}';
    }

}
