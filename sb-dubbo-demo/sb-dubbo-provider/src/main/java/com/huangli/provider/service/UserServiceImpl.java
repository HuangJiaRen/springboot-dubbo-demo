package com.huangli.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huangli.dubbo.api.bean.User;
import com.huangli.dubbo.api.service.UserService;
import com.huangli.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author huangli
 * @version 1.0
 * @description TODO
 * @date 2019-07-22 16:44
 */

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(1L);
    }
}
