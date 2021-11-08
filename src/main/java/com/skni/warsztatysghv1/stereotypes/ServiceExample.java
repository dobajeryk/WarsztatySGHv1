package com.skni.warsztatysghv1.stereotypes;

import org.springframework.stereotype.Service;

@Service
public class ServiceExample {
    public ServiceExample(RepositoryExample repository) {
        System.out.println("Tworze beana - ServiceExample");
    }
}
