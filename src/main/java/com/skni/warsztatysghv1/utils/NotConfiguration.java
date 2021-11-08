package com.skni.warsztatysghv1.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotConfiguration {

    @Bean
    MyCustomBean createCustomBean() {
        return new MyCustomBean();
    }

}
