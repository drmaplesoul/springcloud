package com.zdr.springcloud.userserver.controller;

import com.zdr.springcloud.userserver.utils.RedisUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
public class RedisTestController {
    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @Autowired
    RedisUtils redisUtils;

    @RequestMapping("/redis/put/{key}")
    public String putRedisValue(@PathVariable("key")String key,String value){
        try{
            redisTemplate.opsForValue().getAndSet(key,value);
            return "You had put into redis !"+key+":"+value;
        }catch (Exception e){
            return e.getMessage();
        }

    }
    @RequestMapping("/redis/put/{namespace}/{key}")
    public String putRedisValue2(@PathVariable("namespace") String namespace, @PathVariable("key")String key,String value){
        try{
            String acKey = namespace+"::"+key;
            redisTemplate.opsForValue().getAndSet(acKey,value);
            return "You had put into redis !"+acKey+":"+value;
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
    @RequestMapping("/redis/get/{namespace}/{key}")
    public String getRedisValue2(@PathVariable("namespace") String namespace,@PathVariable("key")String key){
        try{
            String acKey = namespace+"::"+key;
            Object data = redisTemplate.opsForValue().get(acKey);
            return "You had get "+acKey+" from redis ,values is "+data;
        }catch (Exception e){
            return e.getMessage();
        }

    }

    @RequestMapping("/redis/clear")
    public void clearRedis(){
        try{
            redisTemplate.delete(redisTemplate.keys( "*"));
        }catch (Exception e){
            log.error("{}",e);
        }

    }
}
