package com.quxie.store.entity.model;

import lombok.Data;

/**
 * 登录请求体
 */
@Data
public class LoginBody {
    private String username;
    private String password;
}
