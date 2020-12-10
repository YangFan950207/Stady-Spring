package com.yangfan.stady.service;

import com.yangfan.stady.mapper.UserMapper;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public void getUser() {
        userMapper.getUser();
    }
}
