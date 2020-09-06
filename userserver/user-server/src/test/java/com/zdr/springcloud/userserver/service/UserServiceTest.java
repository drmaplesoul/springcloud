package com.zdr.springcloud.userserver.service;

import com.zdr.springcloud.userserver.entity.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest(classes = UserServiceTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
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
    public void testGetAllUser() {
        List data = userService.getUserList();
        log.info("data={}", data);
    }

    @Test
    public void testUser1Mock() {
        new MockUp<UserService>(UserService.class) {
            @Mock
            List<UserInfoDto> getUserList() {
                List data = new ArrayList();
                UserInfoDto item = new UserInfoDto();
                item.setUserId("MockedUser");
                data.add(item);
                return data;
            }
        };

        List<UserInfoDto> data = userService.getUserList();
        log.info("data={}", data);
        Assert.assertNull(data);
        Assert.assertEquals("MockedUser", data.get(0).getUserId());
    }
}