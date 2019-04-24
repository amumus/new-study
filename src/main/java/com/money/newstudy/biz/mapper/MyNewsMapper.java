package com.money.newstudy.biz.mapper;

import com.money.newstudy.biz.autoCode.pojo.News;
import com.money.newstudy.dto.NewsDto;
import java.util.List;

//@Mapper
//@Repository
public interface MyNewsMapper {
    List<News> selectNews(NewsDto vo);
    int selectNewsCount(NewsDto vo);

    List<News> selectByNewsIds(List<Integer> list);
}
