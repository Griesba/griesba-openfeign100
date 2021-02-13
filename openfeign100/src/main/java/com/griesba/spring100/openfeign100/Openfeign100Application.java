package com.griesba.spring100.openfeign100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Openfeign100Application {

    public static void main(String[] args) {
        SpringApplication.run(Openfeign100Application.class, args);
    }

}
