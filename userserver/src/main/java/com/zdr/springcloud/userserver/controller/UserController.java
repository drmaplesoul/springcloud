package com.zdr.springcloud.userserver.controller;

import com.zdr.springcloud.userserver.repositry.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

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
}
