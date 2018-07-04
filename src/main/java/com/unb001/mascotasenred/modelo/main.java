/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unb001.mascotasenred.modelo;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        // manager.getTransaction().begin();

        Query query = manager.createQuery("SELECT e FROM Denunciante e");

        System.out.println((Collection<Denunciante>) query.getResultList());

        for (Denunciante cli : (Collection<Denunciante>) query.getResultList()) {
            System.out.println("DENUNCIANTE: ");
            System.out.println(cli);
        }
        
        System.out.println("salvando: ");
        Denunciante nuevo = new Denunciante(4, "otro", "apellido", "Calle",  "mail");
        
        manager.getTransaction().begin();
        //si esta la PK lo une sino lo crea
        manager.merge(nuevo);
        //crea siempre, si ya estaba la PK da error
        manager.persist(nuevo);
        manager.getTransaction().commit();
  
        manager.close();
        emf.close();

    }

}
