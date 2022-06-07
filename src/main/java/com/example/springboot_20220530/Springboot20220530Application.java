package com.example.springboot_20220530;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:/beans.xml"})
@SpringBootApplication
public class Springboot20220530Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot20220530Application.class, args);
    }

}
