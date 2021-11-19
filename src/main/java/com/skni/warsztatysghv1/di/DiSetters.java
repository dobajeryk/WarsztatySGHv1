package com.skni.warsztatysghv1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DiSetters {

    private MyComponent myComponent;

    @Autowired
    public void setMyComponent(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() {
        System.out.print("Klasa DiSetters - ");
        myComponent.test();
    }
}
