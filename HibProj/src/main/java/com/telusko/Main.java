package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args)  {

        Student s1 = new Student();
        /*s1.setsName("Bruno");
        s1.setRollNo(103);
        s1.setsAge(34);*/

        //Student s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        s1 = session.find(Student.class, 107);

        Transaction transaction = session.beginTransaction();

        session.remove(s1);

        //Update
        // session.merge(s1);

        transaction.commit();

        //s2 = session.find(Student.class ,102);

        // Transaction transaction = session.beginTransaction();

        //session.persist(s1);

        //transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
        }
    }
