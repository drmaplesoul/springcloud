package com.zdr.springcloud.venusdemo.controller;

import com.zdr.springcloud.venusdemo.repositry.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserDao userDao;
    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("/user/GetUserList")
    public List queryUsers(){
        return userDao.getUserList();
    }

    @RequestMapping("/user/{id}")
    public Map findUser(@PathVariable String id){
        Map res = userDao.findUser(id);
        LOGGER.info("{}",res);
        return res;
    }

    @RequestMapping("/index")
    public void index(){
        redisTemplate.opsForValue().get("key");
    }
}
