package com.money.newstudy.biz.autoCode.mapper;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import java.util.List;

public interface FavoritesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Favorites record);

    Favorites selectByPrimaryKey(Integer id);

    List<Favorites> selectAll();

    int updateByPrimaryKey(Favorites record);
}