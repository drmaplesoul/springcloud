package com.zdr.springcloud.userserver.repositry;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public List getUserList();

    public Map findUser(String id);
}
