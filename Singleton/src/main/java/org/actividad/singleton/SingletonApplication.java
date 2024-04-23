package org.actividad.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonApplication.class, args);
     AppConfig config = AppConfig.getInstance();

     config.setServerUrl("https://www.testing.com");
     String serverUrl = config.getServerUrl();
     System.out.println("URL del servidor "+ serverUrl);
     config.setPort(4000);

     int port = config.getPort();
        System.out.println("Puerto del servidor: "+port);

    }

}
