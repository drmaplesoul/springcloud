package com.zdr.springcloud.tickerserver.controller;

import com.zdr.springcloud.tickerserver.repositry.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/user/GetUserList")
    public List queryUsers(){
        return userDao.getUserList();
    }
}
