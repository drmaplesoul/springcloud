package com.example.zdr.mybatisgeneratorboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.example.zdr.mybatisgeneratorboot.mapper")
public class MybatisGeneratorBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorBootApplication.class, args);
    }

}
