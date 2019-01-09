package com.zdr.springcloud.userserver.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void sayHello(){
        System.out.println("Hello World Service!");
    }
}
