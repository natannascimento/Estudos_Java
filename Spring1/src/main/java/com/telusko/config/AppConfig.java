package com.telusko.config;

import com.telusko.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//    @Bean(name = {"desktop1", "desktop2", "desktop3"})
    @Bean
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
