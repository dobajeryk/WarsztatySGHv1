package com.skni.warsztatysghv1.stereotypes;

import com.skni.warsztatysghv1.utils.MyCustomBean;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryExample {
    public RepositoryExample(MyCustomBean myCustomBean) {
        System.out.println("Tworze beana - RepositoryExample");
    }
}
