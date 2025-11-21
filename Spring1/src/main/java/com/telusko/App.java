package com.telusko;

import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();

        Desktop desktop2 = context.getBean(Desktop.class);
        desktop2.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien alien1 = context.getBean("alien", Alien.class);
//        //alien1.setAge(21);
//        System.out.println(alien1.getAge());
//        alien1.code();

//
//        Alien alien2 = (Alien) context.getBean("alien");
//        //alien2.code();
//        System.out.println(alien2.age);

//        Computer computer = context.getBean(Computer.class);
//
//        Desktop desktop =  context.getBean( Desktop.class);
    }
}
