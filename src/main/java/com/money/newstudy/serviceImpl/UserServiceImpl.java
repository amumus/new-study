package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.pojo.User;
import com.money.newstudy.biz.mapper.MyUserMapper;
import com.money.newstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    MyUserMapper myUserMapper;

    @Override
    public User login(User user) {
        return myUserMapper.login(user);
    }
}
