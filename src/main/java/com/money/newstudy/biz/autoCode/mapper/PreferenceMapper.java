package com.money.newstudy.biz.autoCode.mapper;

import com.money.newstudy.biz.autoCode.pojo.Preference;
import java.util.List;

public interface PreferenceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Preference record);

    Preference selectByPrimaryKey(Integer id);

    List<Preference> selectAll();

    int updateByPrimaryKey(Preference record);
}