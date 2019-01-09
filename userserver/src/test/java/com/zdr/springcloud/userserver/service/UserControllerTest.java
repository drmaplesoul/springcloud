package com.zdr.springcloud.userserver.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = UserControllerTest.class)
@RunWith(SpringRunner.class)
//@ComponentScan("com.zdr.springcloud.userserver.service") //这行不加将会找不到Bean
public class UserControllerTest {
    @Autowired
    private  UserService userService;

    @Test
    public void helloworld(){
        userService.sayHello();
    }
}