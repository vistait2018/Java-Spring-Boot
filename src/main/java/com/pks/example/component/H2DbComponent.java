package com.pks.example.component;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("qa")
public class H2DbComponent implements  DbComponent{
    @Override
    public void performDbComponent() {
        System.out.println("from H2Database");
    }
}
