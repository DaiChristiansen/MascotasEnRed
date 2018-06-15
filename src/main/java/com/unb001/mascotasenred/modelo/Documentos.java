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
    private int tipo;
    private String nombre;
    private float nro;

    public Documentos(int tipo, String nombre, float nro) {
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

    public void setNro(float nro) {
        this.nro = nro;
    }
    
}
