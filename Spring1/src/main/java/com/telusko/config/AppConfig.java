package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien(@Autowired Computer computer) {
        Alien object = new Alien();
        object.setAge(21);
        object.setComputer(computer);
        return object;
    }

//    @Bean(name = {"desktop1", "desktop2", "desktop3"})
    @Bean
    //@Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
