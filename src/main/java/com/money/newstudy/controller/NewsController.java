package com.money.newstudy.controller;

import com.money.newstudy.common.ResultObject;
import com.money.newstudy.dto.NewsDto;
import com.money.newstudy.service.NewsServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class NewsController {
    @Autowired
    NewsServcie newsService;

    @RequestMapping("/umi/news/getNewsList")
    @ResponseBody
    public ResultObject getNewsList(NewsDto dto){
        Map map = newsService.getNewsList(dto);
        ResultObject resultObject = ResultObject.successResult() ;
        resultObject.setData(map);
        return resultObject;

    }



}
