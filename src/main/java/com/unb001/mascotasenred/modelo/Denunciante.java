package com.unb001.mascotasenred.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


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

    
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private long telefono;
 
    
   

    public Denunciante() {     // super();
    }

    public Denunciante(int dni, String nombre, String apellido, String direccion, String email, long telefono) {
        
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Denunciante{" + " dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + '}';
    }

}
