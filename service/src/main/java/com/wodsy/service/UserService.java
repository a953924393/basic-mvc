package com.wodsy.service;

import com.wodsy.dao.UserMapper;
import com.wodsy.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 名称：com.wodsy.service
 * 描述：<br>
 * 类型：JAVA<br>
 * 最近修改时间：03/12/2014 11:13<br>
 *
 * @author Jack Chan
 * @since 03/12/2014
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User selectByPrimaryKey(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

}
