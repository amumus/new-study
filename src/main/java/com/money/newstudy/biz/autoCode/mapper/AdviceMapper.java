package com.money.newstudy.biz.autoCode.mapper;

import com.money.newstudy.biz.autoCode.pojo.Advice;
import java.util.List;

public interface AdviceMapper {
    int insert(Advice record);

    List<Advice> selectAll();
}