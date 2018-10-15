package com.hongcd.cloud.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 图书服务启动类
 * @author HongD
 * @date 2018-10-15
 */
@SpringCloudApplication
public class BmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
