package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.mapper.FavoritesMapper;
import com.money.newstudy.biz.autoCode.mapper.MylikeMapper;
import com.money.newstudy.biz.autoCode.mapper.NewsMapper;
import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.biz.autoCode.pojo.News;
import com.money.newstudy.biz.mapper.MyMylikeMapper;
import com.money.newstudy.biz.mapper.MyNewsMapper;
import com.money.newstudy.dto.FavoritesDto;
import com.money.newstudy.service.MylikeService;
import com.money.newstudy.vo.FavoritesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
    @Autowired
    private MyNewsMapper myNewsMapper;

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
        Map result = new HashMap();
        List<FavoritesVo> myMylikeList = myMylikeMapper.selectMyFavoritesByUserId(favoritesDto);
        List<Integer> newsIdList = new ArrayList<>();
        for(FavoritesVo f : myMylikeList){
            newsIdList.add(f.getNewsId());
        }
        List<News> newsList = myNewsMapper.selectByNewsIds(newsIdList);
        Map<Integer,News> newsMap = new HashMap<>();
        for(News n : newsList){
            newsMap.put(n.getId(),n);
        }
        for(FavoritesVo f : myMylikeList){
            f.setNews(newsMap.get(f.getNewsId()));
        }
        result.put("list",myMylikeList);
        Integer myMylikeCount = myMylikeMapper.selectMyFavoritesByUserIdCount(favoritesDto);
        result.put("count",myMylikeCount);
        return result;
    }
}
