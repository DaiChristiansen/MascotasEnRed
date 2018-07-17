/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unb001.mascotasenred.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class mainCaro {

    public static void buscarDenunciante(int dni) {
        //buscar un denunciante por la PK
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        System.out.println("");
        System.out.println("BUSCANDO");
        Denunciante denunciante = manager.find(Denunciante.class, dni);
        System.out.println("Nombre del denunciante: " + denunciante.getNombre());

        manager.close();
        emf.close();
    }

    public static void agregarMascota(Mascota m) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
       // Mascota mascota4 = new Mascota(22, "ot", "ave", "otro", "gris", "ninguna", "pequeño", "zona", "perdido");
        try {
            //manager.merge(mascota4);
            manager.persist(m);
            manager.getTransaction().commit();
            manager.close();
            emf.close();

        } catch (EntityExistsException e) {
            System.out.println("no me lo agrego");

        }
    }

    public static void agregarDenunciante(Denunciante d) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();

        try {
            manager.merge(d);
            manager.persist(d);
            manager.getTransaction().commit();
            //manager.close();
            //emf.close();

        } catch (EntityExistsException e) {
            System.out.println("ya existe este dato");
        }

    }

   
  

    public static void imprimirDenunciantes() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        Query query = manager.createQuery("SELECT e FROM Denunciante e");
        for (Denunciante den : (Collection<Denunciante>) query.getResultList()) {
            System.out.println("DENUNCIANTE: ");
            System.out.println(den);
        }

        //System.out.println("");
        // System.out.println("DENUNCIANTE: ");
        manager.close();
        emf.close();
    }

   

    public static void main(String[] args) {
        
         
        // EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        //EntityManager manager = emf.createEntityManager();
       // manager.getTransaction().begin();
       // Mascota mascota8 = new Mascota(25, "utlimo", "p", "otro", "bicolor", "sinpata", "pequeño", "zona", "perdido");
       //agregarMascota(Mascota m);
        

//Mascota mascota2 = new Mascota(11,"Violeta", "gato","nose","blanco","nada", "grande","centro","adopcion");
       //// try {
           // manager.merge(mascota1);
           // manager.persist(mascota1);
            //manager.persist(mascota2); 
           // manager.getTransaction().commit();
           // manager.close();
           // emf.close();

       // } catch (EntityExistsException e) {
            //System.out.println("no me lo agrego");

        //}*/

        //Denunciante denunciante1 = new Denunciante(1, "caro", "copes", "ffff", "4444");
        // Denunciante denunciante2 = new Denunciante(2, "maria", "rivas", "gggg", "5555");
        // Telefono telefono1 = new Telefono(1, 249, 4012272, "M", denunciante1.getDni());
        // List<Telefono> d1Telefono = new ArrayList<>();
        // d1Telefono.add(telefono1);
        // denunciante1.setTelefono(d1Telefono);
        //agregarDenunciante(denunciante1);
        //agregarDenunciante(denunciante2);
      

        //imprimirDenunciantes();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        Query query = manager.createQuery("SELECT e FROM Denuncia e");
        for (Denuncia den : (Collection<Denuncia>) query.getResultList()) {
            System.out.println("Mascota: ");
            System.out.println(den);
        }

        //System.out.println("");
        // System.out.println("DENUNCIANTE: ");
        //manager.close();
        //emf.close();
        
        //imprimirTelefonos();
        //buscarDenunciante(4);
        //HAGO ESTE COMENTARIO MAS QUE NADA PARA HACER EL COMMIT SINO NO ME DEJA...
    }
}
