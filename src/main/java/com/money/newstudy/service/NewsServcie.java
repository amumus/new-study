package com.money.newstudy.service;

import com.money.newstudy.biz.autoCode.pojo.News;
import com.money.newstudy.dto.NewsDto;

import java.util.Map;

public interface NewsServcie {
    Map getNewsList(NewsDto dto);

    News getNews(Integer id);
}
