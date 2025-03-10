package com.pks.example.controller;

import com.pks.example.component.HelloWorldComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    public HelloWorld(HelloWorldComponent helloWorldComponent) {
        this.helloWorldComponent = helloWorldComponent;
    }

    private HelloWorldComponent helloWorldComponent;

    @GetMapping({"","/"})
    public String sayHello(){
        return helloWorldComponent.sayHello();
    }
}
