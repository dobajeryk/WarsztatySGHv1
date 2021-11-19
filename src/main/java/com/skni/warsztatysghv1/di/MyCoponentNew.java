package com.skni.warsztatysghv1.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyCoponentNew implements MyComponent {
    @Override
    public void test() {
        System.out.println("Wstrzyknieto bean (MyComponentNew)");
    }
}
