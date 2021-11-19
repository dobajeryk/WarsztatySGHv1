package com.skni.warsztatysghv1.di;

import org.springframework.stereotype.Component;

@Component
public class MyComponentSecond implements MyComponent{
    @Override
    public void test() {
        System.out.println("Wstrzyknieto bean (MyComponentSecond)");
    }
}
