package com.money.newstudy.biz.mapper;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;

public interface MyMylikeMapper {
    Integer exitMyLike(Mylike mylike);

    Integer deleteMylikeByUserIdAndNewsId(Mylike mylike);

    Integer exitFavorites(Favorites favorites);

    Integer deleteFavoritesByUserIdAndNewsId(Favorites favorites);
}
