package com.money.newstudy.biz.mapper;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.dto.FavoritesDto;
import com.money.newstudy.vo.FavoritesVo;
import com.money.newstudy.vo.NewsVo;

import java.util.List;
import java.util.Map;

public interface MyMylikeMapper {
    Integer exitMyLike(Mylike mylike);

    Integer deleteMylikeByUserIdAndNewsId(Mylike mylike);

    Integer exitFavorites(Favorites favorites);

    Integer deleteFavoritesByUserIdAndNewsId(Favorites favorites);

    List<FavoritesVo> selectMyFavoritesByUserId(FavoritesDto favoritesDto);

    Integer selectMyFavoritesByUserIdCount(FavoritesDto favoritesDto);

    Integer selectNewsFavoritesCount(Integer id);

    List<Map> selectMyFavoritesByUserIdAndKeyword(FavoritesDto favoritesDto);

    Integer selectMyFavoritesByUserIdAndKeywordCount(FavoritesDto favoritesDto);

    Integer isMyLike(FavoritesDto favoritesDto);

    Integer isMyFavoritest(FavoritesDto favoritesDto);
}
