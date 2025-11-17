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

        Laptop laptop = session.getReference(Laptop.class, 2);

        //System.out.println(laptop);

        session.close();

        sf.close();

        }
    }
