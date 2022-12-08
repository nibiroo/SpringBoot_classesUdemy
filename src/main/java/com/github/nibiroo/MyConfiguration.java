package com.github.nibiroo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    // For each configuration, it's used @Bean annotation
    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Venda";
    }
}