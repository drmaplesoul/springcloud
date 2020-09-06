package com.example.zdr.mybatisgeneratorboot.service.impl;

import com.example.zdr.mybatisgeneratorboot.entity.UserInfoEntity;
import com.example.zdr.mybatisgeneratorboot.mapper.UserInfoMapper;
import com.example.zdr.mybatisgeneratorboot.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 枫枫小虫
 * @since 2020-08-30
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfoEntity> implements IUserInfoService {

}
