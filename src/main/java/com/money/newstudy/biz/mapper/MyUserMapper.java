package com.money.newstudy.biz.mapper;

import com.money.newstudy.biz.autoCode.pojo.User;

import java.util.List;

public interface MyUserMapper {
    List<User> findByIds(List<Integer> list);

    User login(User user);
}
