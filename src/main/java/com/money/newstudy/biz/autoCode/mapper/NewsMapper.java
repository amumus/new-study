package com.money.newstudy.biz.autoCode.mapper;

import com.money.newstudy.biz.autoCode.pojo.News;
import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    News selectByPrimaryKey(Integer id);

    List<News> selectAll();

    int updateByPrimaryKey(News record);
}