package com.sawako.service.serial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SerialApplication {
    public static void main(String[] args) {
        SpringApplication.run(SerialApplication.class, args);
    }
}
