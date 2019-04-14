package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.mapper.NewsMapper;
import com.money.newstudy.biz.autoCode.pojo.News;
import com.money.newstudy.biz.mapper.MyNewsMapper;
import com.money.newstudy.dto.NewsDto;
import com.money.newstudy.service.NewsServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsServcie {

    @Autowired
    private MyNewsMapper myNewsMapper;
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public Map getNewsList(NewsDto dto) {
        dto.setPageStart(dto.getPageStart() * dto.getPageNum());
        List<News> list = myNewsMapper.selectNews(dto);
        int count = myNewsMapper.selectNewsCount(dto);
        Map map = new HashMap();
        map.put("data",list);
        map.put("count",count);
        return map;
    }

    @Override
    public News getNews(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
