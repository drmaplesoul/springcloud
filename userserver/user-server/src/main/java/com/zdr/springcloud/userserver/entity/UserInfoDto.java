package com.zdr.springcloud.userserver.entity;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class UserInfoDto {
    private String userId;
    private  String userName;
    private static final String ON="1";

    /**
     * Hello
     * @param args out paras
     */
    public static void main(String[] args) {
        String name = args[0];
        if (ON.equals(name)){
            System.out.println("hello world");
        }
    }
}
