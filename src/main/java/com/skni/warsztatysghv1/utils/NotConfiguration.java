package com.skni.warsztatysghv1.utils;

import org.springframework.context.annotation.Bean;

public class NotConfiguration {

    @Bean
    MyCustomBean createCustomBean() {
        return new MyCustomBean();
    }

}
