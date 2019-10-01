package com.zdr.springcloud.venusdemo;

import com.zdr.springcloud.venusdemo.repositry.UserDao;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ExtendWith(SpringExtension.class)
@DisplayName("第一个Junit5")
@RunWith(SpringRunner.class)
@SpringBootTest
public class Junit5Test extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(Junit5Test.class);

    @Autowired
    UserDao userDao;

    @Test
    public void testUser(){
        List data =  userDao.getUserList();
        log.info("Junit5 response data is {}",data);
    }
}
