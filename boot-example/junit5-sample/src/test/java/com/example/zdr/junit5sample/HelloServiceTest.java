package com.example.zdr.junit5sample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class HelloServiceTest {
    @Autowired
    HelloService service;

    @Test
    void contextLoads() {
    }

    @Test
    public void testHelloWorld(){
        service.hello();
    }
}
