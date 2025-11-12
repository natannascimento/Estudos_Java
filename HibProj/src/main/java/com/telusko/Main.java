package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args)  {

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Natan");
        a1.setTech("Java");

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(a1);
        }
    }
