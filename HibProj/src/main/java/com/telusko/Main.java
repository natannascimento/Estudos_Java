package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main(String[] args)  {

        Student s1 = new Student();
        s1.setsName("Messias");
        s1.setRollNo(107);
        s1.setsAge(60);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();;

        System.out.println(s1);
        }
    }
