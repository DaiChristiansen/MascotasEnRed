/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unb001.mascotasenred.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class main {

    public static void main(String[] args) {
        // TODO code application logic here

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");
        EntityManager manager = emf.createEntityManager();
        // manager.getTransaction().begin();

        Query query = manager.createQuery("SELECT e FROM Denunciante e");

        System.out.println((Collection<Denunciante>) query.getResultList());

        for (Denunciante cli : (Collection<Denunciante>) query.getResultList()) {
            System.out.println(cli);
        }

        manager.close();
        emf.close();

    }

}
