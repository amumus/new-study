package com.money.newstudy.biz.autoCode.mapper;

import com.money.newstudy.biz.autoCode.pojo.Content;
import java.util.List;

public interface ContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    Content selectByPrimaryKey(Integer id);

    List<Content> selectAll();

    int updateByPrimaryKey(Content record);
}