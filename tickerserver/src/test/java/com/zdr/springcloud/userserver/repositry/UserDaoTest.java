package com.zdr.springcloud.userserver.repositry;

import com.zdr.springcloud.tickerserver.repositry.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(value = "dev")
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoTest.class);

    @Test
    public void testGetUserList() {
        List data = userDao.getUserList();
        for (Object item :data){
            LOGGER.info("用户:{}",item);
        }
        Assert.assertNotNull(data);
    }
}