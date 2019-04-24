package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.mapper.FavoritesMapper;
import com.money.newstudy.biz.autoCode.mapper.MylikeMapper;
import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.biz.mapper.MyMylikeMapper;
import com.money.newstudy.dto.FavoritesDto;
import com.money.newstudy.service.MylikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MylikeServiceImpl implements MylikeService {

    @Autowired
    private MyMylikeMapper myMylikeMapper;
    @Autowired
    private MylikeMapper mylikeMapper;
    @Autowired
    private FavoritesMapper favoritesMapper;


    /**
     * 点赞
     * @param mylike
     * @return
     */
    @Override
    public Integer addMyLike(Mylike mylike) {
        Integer exitMyLike = myMylikeMapper.exitMyLike(mylike);
        //未给改文章点过赞
        if(exitMyLike == 0){
            return mylikeMapper.insert(mylike);
        }else{//点过赞的
            myMylikeMapper.deleteMylikeByUserIdAndNewsId(mylike);
            return 0;
        }
    }

    @Override
    public Integer addFavorites(Favorites favorites) {
        Integer exitMyLike = myMylikeMapper.exitFavorites(favorites);
        //未给改文章点过赞
        if(exitMyLike == 0){
            return favoritesMapper.insert(favorites);
        }else{//点过赞的
            myMylikeMapper.deleteFavoritesByUserIdAndNewsId(favorites);
            return 0;
        }
    }

    @Override
    public Map getMyFavorites(FavoritesDto favoritesDto) {
        List<Favorites> myMylikeMapper = null;

        return null;
    }
}
