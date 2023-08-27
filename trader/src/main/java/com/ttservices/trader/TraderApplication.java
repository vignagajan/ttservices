package com.ttservices.trader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TraderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TraderApplication.class,args);
    }
}
