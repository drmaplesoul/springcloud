package com.example.zdr.junit5sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {
    public void hello(){
        log.info("Hello World!");
    }
}
