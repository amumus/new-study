package com.money.newstudy.biz.mapper;

import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.biz.autoCode.pojo.News;
import com.money.newstudy.dto.NewsDto;
import com.money.newstudy.vo.NewsVo;

import java.util.List;
import java.util.Map;

//@Mapper
//@Repository
public interface MyNewsMapper {
    List<News> selectNews(NewsDto vo);
    int selectNewsCount(NewsDto vo);

    List<NewsVo> selectByNewsIds(List<Integer> list);

    int updateNewsLikeNumber(Map map);

    int updateFavoritesNumber(Map map);
}
