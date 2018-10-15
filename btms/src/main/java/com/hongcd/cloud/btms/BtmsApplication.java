package com.hongcd.cloud.btms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author HongD
 */
@EnableDiscoveryClient
@SpringBootApplication
public class BtmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BtmsApplication.class, args);
    }
}
