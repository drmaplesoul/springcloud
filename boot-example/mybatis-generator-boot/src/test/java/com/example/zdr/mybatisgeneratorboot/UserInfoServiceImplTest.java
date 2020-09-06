package com.example.zdr.mybatisgeneratorboot;

import com.example.zdr.mybatisgeneratorboot.service.impl.UserInfoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = UserInfoServiceImplTest.class)
@Slf4j
//@AutoConfigureMybatis
//@MybatisTest
@MapperScan("com.example.zdr.mybatisgeneratorboot")
public class UserInfoServiceImplTest {
    @Resource
    UserInfoServiceImpl service;
    @Test
    void contextLoads() {
    }

    @Test
    public void testGetUserInfo(){
        log.info("开始单元测试");
        List data = service.list();
        log.info("{}",data);
    }
}
