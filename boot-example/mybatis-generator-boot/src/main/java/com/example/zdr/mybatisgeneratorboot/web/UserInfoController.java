package com.example.zdr.mybatisgeneratorboot.web;

import com.example.zdr.mybatisgeneratorboot.entity.UserInfoEntity;
import com.example.zdr.mybatisgeneratorboot.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 枫枫小虫
 * @since 2020-08-30
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Autowired
    UserInfoServiceImpl service;

    @GetMapping("all")
    public List<UserInfoEntity> getAllUserInfo(){
        return service.list();
    }

}
