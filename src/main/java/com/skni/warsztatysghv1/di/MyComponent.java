package com.skni.warsztatysghv1.di;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public void test() {
        System.out.println("Wstrzyknieto bean (MyComponent)");
    }
}
