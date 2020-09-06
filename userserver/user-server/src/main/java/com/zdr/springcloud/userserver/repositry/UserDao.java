package com.zdr.springcloud.userserver.repositry;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
@CacheConfig(cacheNames = "users")
public interface UserDao {
    /**
     *
     * @return
     */
    public List getUserList();

    /**
     *
     * @param id
     * @return
     */
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Cacheable(key ="#p0")
    public Map findUser(String id);
}
