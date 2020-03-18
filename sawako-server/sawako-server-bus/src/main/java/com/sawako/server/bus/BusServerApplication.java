package com.sawako.server.bus;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BusServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusServerApplication.class, args);
    }
}
