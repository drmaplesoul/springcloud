package com.zdr.springcloud.userserver.service;

import com.zdr.springcloud.userserver.repositry.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;

@SpringBootTest(classes = UserControllerTest.class)
@RunWith(SpringRunner.class)
//@MapperScan("com.zdr.springcloud.userserver.repositry")
@WebAppConfiguration
public class UserControllerTest {

//    @Autowired
//    UserDao userDao;

    @Test
    public void queryUsers() {
//        Assert.notEmpty(userDao.getUserList());
    }

    @Test
    public void findUser() {
    }
}