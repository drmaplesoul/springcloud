package com.zdr.springcloud.userserver.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest(classes = UserServiceTest.class)
@RunWith(SpringRunner.class)
@MapperScan("com.zdr.springcloud.userserver")
@ComponentScan("com.zdr.springcloud.userserver") //这行不加将会找不到Bean
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void findUserById() {
        Map data = userService.findUserById("ZHANGSHAN");
        System.out.println(data);
    }

    @Test
    public void testGetAllUser(){
        List data = userService.getUserList();
        log.info("data={}",data);
    }
}