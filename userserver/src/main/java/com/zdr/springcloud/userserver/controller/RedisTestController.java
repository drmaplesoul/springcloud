package com.zdr.springcloud.userserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {
    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @RequestMapping("/redis/put/{key}")
    public String putRedisValue(@PathVariable("key")String key,String value){
        try{
            redisTemplate.opsForValue().getAndSet(key,value);
            return "You had put into redis !"+key+":"+value;
        }catch (Exception e){
            return e.getMessage();
        }

    }

    @RequestMapping("/redis/get/{key}")
    public String getRedisValue(@PathVariable("key")String key){
        try{
            Object data = redisTemplate.opsForValue().get(key);
            return "You had get "+key+" from redis ,values is "+data;
        }catch (Exception e){
            return e.getMessage();
        }

    }
}
