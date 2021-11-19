package com.skni.warsztatysghv1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DiFields {

    @Autowired
    private MyComponent2 myComponent;

    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() {
        System.out.print("Klasa DiFields - ");
        myComponent.test();
    }

}
