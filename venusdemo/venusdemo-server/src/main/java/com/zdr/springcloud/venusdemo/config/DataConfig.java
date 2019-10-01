package com.zdr.springcloud.venusdemo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource({"classpath:application.yml"})
@Component
public class DataConfig {

    @Value("spring.datasource.driver-class-name")
    private String driver;
    @Value("spring.datasource.url")
    private String url;
    @Value("spring.datasource.username")
    private String username;
    @Value("spring.datasource.password")
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
