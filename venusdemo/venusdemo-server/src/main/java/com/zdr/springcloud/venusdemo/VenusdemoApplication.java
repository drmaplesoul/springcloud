package com.zdr.springcloud.venusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zdr.springcloud.venusdemo.repositry")
@EnableCaching
public class VenusdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenusdemoApplication.class, args);
    }

}

