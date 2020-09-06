package com.zdr.springcloud.userserver.service;

import com.zdr.springcloud.userserver.repositry.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author drmaple
 */
@Service
@Slf4j
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
        String user;
        return userDao.getUserList();

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String h = new String("hello");
        list.add(h);
        log.info("result={}",list.contains(h));
        log.info("result={}",list.contains("hello"));
        log.info("result={}",list.contains(new String("hello")));
    }
}
