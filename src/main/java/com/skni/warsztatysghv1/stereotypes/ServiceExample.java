package com.skni.warsztatysghv1.stereotypes;

import com.skni.warsztatysghv1.utils.MyCustomBean;
import org.springframework.stereotype.Service;

@Service
public class ServiceExample {
    public ServiceExample(RepositoryExample repository, MyCustomBean myCustomBean) {
        System.out.println("Tworze beana - ServiceExample");
    }
}
