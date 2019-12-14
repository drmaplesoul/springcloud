package com.zdr.springcloud.userserver.service;

import com.netflix.discovery.converters.Auto;
import com.zdr.springcloud.userserver.repositry.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void sayHello(){
        System.out.println("Hello World Service!");
    }

    public Map findUserById(String userId){
        return userDao.findUser(userId);
    }

    public List getUserList(){
        return userDao.getUserList();
    }
}
