package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manuel
 */
//@Entity(name = "denunciante")
//@Table(name = "Denunciante")
public class Denunciante implements Serializable {
// public static final long serialVersionUID = 123644L;
    //@Id 
   // @Column(name= "Dni")
    private int dni;
   // @Column(name= "Nombre")
    private String nombre;
    //@Column(name= "Apellido")
    private String apellido;
    //@Column(name= "Direccion")
    private String direccion;
    //@Column(name= "email")
    private String email;
    //@OneToMany
    //@JoinColumn(name="dni")       
    // private List<Telefono> telefono = new ArrayList<>();
    //@OneToMany
    // @JoinColumn(name="dni")       
    //private List<Documentos> documentos = new ArrayList<>();
   // @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="NroDenuncia")
     //private Denuncia denuncia;
     
    public Denunciante() {     // super();
    }

    public Denunciante(int dni, String nombre, String apellido, String direccion, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Denunciante{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", email=" + email + '}';
    }

  

   

   

  
}
