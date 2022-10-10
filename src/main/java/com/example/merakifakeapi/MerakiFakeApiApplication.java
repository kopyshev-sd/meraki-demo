package com.example.merakifakeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class MerakiFakeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerakiFakeApiApplication.class, args);
    }

}
