package com.money.newstudy.biz.autoCode.mapper;

import com.money.newstudy.biz.autoCode.pojo.Mylike;
import java.util.List;

public interface MylikeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mylike record);

    Mylike selectByPrimaryKey(Integer id);

    List<Mylike> selectAll();

    int updateByPrimaryKey(Mylike record);
}