package com.pks.example.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MysqlDbComponent implements DbComponent{
    @Override
    public void performDbComponent() {
        System.out.println("From Mysql");
    }
}
