package com.huangli.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huangli.dubbo.api.bean.User;
import com.huangli.dubbo.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangli
 * @version 1.0
 * @description TODO
 * @date 2019-07-22 16:46
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user() {
        return userService.findUser();
    }
}
