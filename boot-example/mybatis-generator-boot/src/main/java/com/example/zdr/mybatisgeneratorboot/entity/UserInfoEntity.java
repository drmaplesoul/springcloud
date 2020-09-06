package com.example.zdr.mybatisgeneratorboot.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author 枫枫小虫
 * @since 2020-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("USER_INFO")
public class UserInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("USER_ID")
    private String userId;

    @TableField("user_pwd")
    private String userPwd;

    @TableField("user_name")
    private String userName;


}
