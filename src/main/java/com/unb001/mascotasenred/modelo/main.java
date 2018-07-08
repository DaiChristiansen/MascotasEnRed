/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unb001.mascotasenred.modelo;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class main {

   
    public static void main(String[] args) {
        // TODO code application logic here

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();

        System.out.println("salvando: ");

        Denunciante nuevo = new Denunciante(4, "otro", "apellido", "Calle", "mail");
        Denunciante nuevo1 = new Denunciante(5, "Marisa", "Reser", "Nigro", "Nose");
        try {                                   //codigo para guardar datos en sql
            
            //si esta la PK lo une sino lo crea
            
             //nuevo.setApellido("Cambiado");// cambia el apellido al que creo Javier
            manager.merge(nuevo);
            //crea siempre, si ya estaba la PK da error
            manager.merge(nuevo1);
            manager.persist(nuevo);
            manager.persist(nuevo1);
           
            
            manager.getTransaction().commit();
            manager.close();
            emf.close();
        } catch (EntityExistsException e) {
            System.out.println("ya existe este dato");
        }

        Query query = manager.createQuery("SELECT e FROM Denunciante e");

        System.out.println((Collection<Denunciante>) query.getResultList());
        System.out.println("");
        for (Denunciante cli : (Collection<Denunciante>) query.getResultList()) {
            System.out.println("DENUNCIANTE: ");
            System.out.println(cli);
        }

        //buscar un denunciante por la PK
        System.out.println("");
        System.out.println("BUSCANDO");
        Denunciante denunciante = manager.find(Denunciante.class, 4);
        System.out.println("Nombre del denunciante: " + denunciante.getNombre());

        
    }

}
