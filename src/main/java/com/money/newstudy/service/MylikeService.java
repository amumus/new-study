package com.money.newstudy.service;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;

public interface MylikeService {
    Integer addMyLike(Mylike mylike);

    Integer addFavorites(Favorites favorites);
}
