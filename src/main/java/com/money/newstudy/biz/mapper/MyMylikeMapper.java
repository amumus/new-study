package com.money.newstudy.biz.mapper;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.dto.FavoritesDto;
import com.money.newstudy.vo.FavoritesVo;

import java.util.List;

public interface MyMylikeMapper {
    Integer exitMyLike(Mylike mylike);

    Integer deleteMylikeByUserIdAndNewsId(Mylike mylike);

    Integer exitFavorites(Favorites favorites);

    Integer deleteFavoritesByUserIdAndNewsId(Favorites favorites);

    List<FavoritesVo> selectMyFavoritesByUserId(FavoritesDto favoritesDto);

    Integer selectMyFavoritesByUserIdCount(FavoritesDto favoritesDto);

    Integer selectNewsFavoritesCount(Integer id);
}
