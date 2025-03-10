package com.pks.example.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {

  Logger log =  LoggerFactory.getLogger(HelloWorldComponent.class);

  public String sayHello(){

     log.info("Info message");
     log.error("Error Logs");
      log.trace("Error Logs");
      log.debug("Error Logs");
    return "Hello from Component";
    }
}
