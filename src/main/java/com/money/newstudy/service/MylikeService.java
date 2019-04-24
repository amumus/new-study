package com.money.newstudy.service;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.dto.FavoritesDto;

import java.util.Map;

public interface MylikeService {
    Integer addMyLike(Mylike mylike);

    Integer addFavorites(Favorites favorites);

    Map getMyFavorites(FavoritesDto favoritesDto);
}
