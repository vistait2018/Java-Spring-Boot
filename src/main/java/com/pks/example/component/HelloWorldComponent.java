package com.pks.example.component;

import com.pks.example.config.ConfigPrefix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {

  Logger log =  LoggerFactory.getLogger(HelloWorldComponent.class);

  @Value("${custom.property.message}")
  private String message;

  @Value("${custom.yaml.message}")
  private String ymlMessage;

  @Autowired
  private ConfigPrefix configPrefix;

  @Autowired
  private DbComponent dbComponent;


  public String sayHello(){

     log.info("Info message");
     log.error("Error Logs");
      log.trace("Error Logs");
      log.debug("Error Logs");
      dbComponent.performDbComponent();
    return message;
//      return "Hello world for "+ configPrefix.getFirstName() + " "+
//              configPrefix.getLastName() +" custom Property";
    }

    public String sayHelloFromYaml() {
        return ymlMessage;
    }
}
