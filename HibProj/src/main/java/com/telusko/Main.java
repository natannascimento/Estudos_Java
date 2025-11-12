package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args)  {

        Student s1 = new Student();
        s1.setsName("Monica");
        s1.setRollNo(106);
        s1.setsAge(56);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.telusko.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        System.out.println(s1);
        }
    }
