package com.huangli.dubbo.api.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author huangli
 * @version 1.0
 * @description TODO
 * @date 2019-07-22 16:40
 */
@Data
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String password;

    private String phone;
}
