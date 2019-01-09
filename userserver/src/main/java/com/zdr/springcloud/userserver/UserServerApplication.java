package com.zdr.springcloud.userserver;

import com.zdr.springcloud.userserver.config.DataConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zdr.springcloud.userserver.repositry")
public class UserServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserServerApplication.class, args);
    }

}

