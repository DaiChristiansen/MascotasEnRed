/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unb001.mascotasenred.modelo;

//import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
//import java.time.LocalDateTime;
//import static java.time.temporal.TemporalQueries.localDate;
import java.util.List;
import javax.lang.model.UnknownEntityException;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class main {

    // private static EntityManager manager;
    //private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
    /* public static void AgregarDenunciante() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        Denunciante nuevo = new Denunciante(6, "otro", "apellido", "Calle", "mail");
        Denunciante nuevo1 = new Denunciante(5, "Marisa", "Reser", "Nigro", "Nose");
        Denunciante nuevo2 = new Denunciante(3, "Mara", "Rodriguez", "tandil", "sitiene");

        try {
            // manager.merge(nuevo);
            // manager.merge(nuevo1);
            //manager.merge(nuevo2);
            //nuevo1.setDenuncia(d);
            manager.persist(nuevo);
            manager.persist(nuevo1);
            // manager.persist(d);
            manager.persist(nuevo2);
            manager.getTransaction().commit();
            manager.close();
            // emf.close();
        } catch (EntityExistsException e) {
            System.out.println("ya existe este dato");
        }
    }
     */
    public static void BuscarDenunciante() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        try {
            System.out.println("BUSCANDO");
            Denunciante denunciante = manager.find(Denunciante.class, 4);
            System.out.println("Nombre del denunciante: " + denunciante.getNombre());
            manager.getTransaction().commit();
            manager.close();
            //emf.close();
        } catch (EntityExistsException e) {
            System.out.println("error en buscar");
        }
    }

    public static void ImprimirTodo() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        Query query = manager.createQuery("SELECT e FROM Denunciante e");

        System.out.println((Collection<Denunciante>) query.getResultList());
        System.out.println("");
        System.out.println("DENUNCIANTE: ");
        for (Denunciante cli : (Collection<Denunciante>) query.getResultList()) {

            System.out.println(cli);
        }
        manager.close();
    }

    public static void RemoverDenunciante() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        try {
            Denunciante denunciante = manager.find(Denunciante.class, 3);
            manager.remove(3);
            manager.getTransaction().commit();
            manager.close();
            //emf.close();
        } catch (IllegalArgumentException e) {
            System.out.println("error en remover");
        }
    }

    public static void CambiarDenunciante() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        try {
            Denunciante denunciante = manager.find(Denunciante.class, 5);
            denunciante.setEmail("si tiene");
            manager.getTransaction().commit();
            manager.close();
            //emf.close();
        } catch (EntityExistsException e) {
            System.out.println("error en cambiar");
        }
    }

    // Date fecha = new Date();
    //  SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    //String f = formateador.format(fecha);
//        System.out.println("La fecha es:" + f);

    /*  EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
       // Mascota mascota1 = new Mascota(10, "otto", "perro", "otro", "negro", "ninguna", "pequeño", "zona", "perdido");
        Mascota mascota3 = new Mascota(15,"Viole", "tortuga","nose","verde","lenta", "grande","centro","adopcion");
        try {
           // manager.merge(mascota1);
           // manager.persist(mascota1);
            manager.persist(mascota3); 
            manager.getTransaction().commit();
            manager.close();
           // emf.close();

        } catch (EntityExistsException e) {
            System.out.println("no me lo agrego");*/
    // }
    // EntityManager manager = emf.createEntityManager();
    // Denunciante nuevo4 = new Denunciante(3, "Maria", "Perez", "Rauch 1589", "maria@perez");
    //Denuncia d = new Denuncia(1, "Extravio", localDateof(12, 05, 1999));
    // Telefono t= new Telefono(1,2225,459,"celular"); 
    //try {
    //  manager.merge(nuevo4);          
    // nuevo4.setTelefono(t);
    //manager.getTransaction().begin();
    //manager.persist(t);
    //manager.persist(nuevo4);
    //manager.getTransaction().commit();
    // manager.close();
    // emf.close();
    // } catch (EntityExistsException e) {
    // System.out.println("no se agrego");
    //  AgregarDenunciante();
    //  ImprimirTodo();
    //  BuscarDenunciante();
    //  CambiarDenunciante();
    // ImprimirTodo();
    //RemoverDenunciante();
    //ImprimirTodo();
    // DenuncianteGrafica dg= new DenuncianteGrafica();  
    //   dg.setVisible(true);
    // }
    /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
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

        
     */
}
