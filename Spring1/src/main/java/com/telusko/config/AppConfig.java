package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.telusko")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer computer) { //@Qualifier("desktop")
//        Alien object = new Alien();
//        object.setAge(21);
//        object.setComputer(computer);
//        return object;
//    }
//
////    @Bean(name = {"desktop1", "desktop2", "desktop3"})
//    @Bean
//    //@Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
