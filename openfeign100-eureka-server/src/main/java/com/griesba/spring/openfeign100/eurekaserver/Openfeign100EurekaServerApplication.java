package com.griesba.spring.openfeign100.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Openfeign100EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Openfeign100EurekaServerApplication.class, args);
    }

}
