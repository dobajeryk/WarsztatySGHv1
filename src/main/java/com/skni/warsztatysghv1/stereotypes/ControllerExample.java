package com.skni.warsztatysghv1.stereotypes;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerExample {
    public ControllerExample(ServiceExample service) {
        System.out.println("Tworze beana - ControllerExample");
    }
}
