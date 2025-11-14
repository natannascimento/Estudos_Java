package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args)  {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Query query = session.createQuery("from Laptop where ram=32", Laptop.class);
        List<Laptop> laptopList =  query.getResultList();

        //Laptop l1 = session.find(Laptop.class, 3);

        System.out.println(laptopList);

        session.close();

        sf.close();

        }
    }
