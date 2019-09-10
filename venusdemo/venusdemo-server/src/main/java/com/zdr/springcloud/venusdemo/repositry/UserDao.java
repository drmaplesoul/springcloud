package com.zdr.springcloud.venusdemo.repositry;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

@CacheConfig(cacheNames = "users")
public interface UserDao {
    public List getUserList();

    @Cacheable(key ="#p0")
    public Map findUser(String id);
}
