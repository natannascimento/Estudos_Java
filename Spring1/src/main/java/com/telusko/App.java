package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien1 = (Alien) context.getBean("alien");
        //alien1.code();
        alien1.age = 21;

        System.out.println(alien1.age);

        Alien alien2 = (Alien) context.getBean("alien");
        //alien2.code();
        System.out.println(alien2.age);
    }
}
