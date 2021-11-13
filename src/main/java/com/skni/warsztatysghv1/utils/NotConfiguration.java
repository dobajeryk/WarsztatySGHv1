package com.skni.warsztatysghv1.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotConfiguration {

    public NotConfiguration() {
        System.out.println("Tworze beana - NotConfiguration");
    }

    @Bean
    MyCustomBean createCustomBean() {
        return new MyCustomBean();
    }

}
