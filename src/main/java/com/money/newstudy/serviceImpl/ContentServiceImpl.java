package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.mapper.ContentMapper;
import com.money.newstudy.biz.autoCode.pojo.Content;
import com.money.newstudy.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Override
    public List<Content> getContentList() {
        return contentMapper.selectAll();
    }
}
