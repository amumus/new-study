package com.money.newstudy.controller;

import com.money.newstudy.biz.autoCode.pojo.Favorites;
import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.common.ResultObject;
import com.money.newstudy.dto.FavoritesDto;
import com.money.newstudy.service.MylikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyLikeController {

    @Autowired
    private MylikeService mylikeService;

    /**
     * 点赞接口
     * @param mylike
     * @return
     */
    @RequestMapping("/mui/myLike/addMyLike")
    @ResponseBody
    public ResultObject addMyLike(Mylike mylike){
        if(mylike.getNewsId()==null || mylike.getUserId() == null){
            return ResultObject.failResult();
        }
        ResultObject resultObject = ResultObject.successResult();
//        点赞返回1，取消点赞返回0
        resultObject.setData(mylikeService.addMyLike(mylike));
        return resultObject;
    }

    @RequestMapping("/mui/favorites/addFavorites")
    @ResponseBody
    public ResultObject addFavorites(Favorites favorites){
        if(favorites.getNewsId()==null || favorites.getUserId() == null){
            return ResultObject.failResult();
        }
        ResultObject resultObject = ResultObject.successResult();
//        点赞返回1，取消点赞返回0
        resultObject.setData(mylikeService.addFavorites(favorites));
        return resultObject;
    }

    @RequestMapping("/mui/favorites/getMyFavorites")
    @ResponseBody
    public ResultObject getMyFavorites(FavoritesDto favoritesDto){
        favoritesDto.setPageStart(favoritesDto.getPageStart() * favoritesDto.getPageNum());
        if(favoritesDto.getUserId() == null){
            return ResultObject.failResult();
        }
        ResultObject resultObject = ResultObject.successResult();
//        点赞返回1，取消点赞返回0
        resultObject.setData(mylikeService.getMyFavorites2(favoritesDto));
        return resultObject;
    }
    @RequestMapping("/mui/favorites/getIfMyFavoritesOrMyLike")
    @ResponseBody
    public ResultObject getIfMyFavoritesOrMyLike(FavoritesDto favoritesDto){
        ResultObject resultObject = ResultObject.successResult();
        resultObject.setData(mylikeService.getIfMyFavoritesOrMyLike(favoritesDto));
        return resultObject;
    }


}
