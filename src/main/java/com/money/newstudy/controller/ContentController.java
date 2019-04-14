package com.money.newstudy.controller;

import com.money.newstudy.biz.autoCode.pojo.Content;
import com.money.newstudy.common.ResultObject;
import com.money.newstudy.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/mui/content/listContent")
    @ResponseBody
    public ResultObject getUniContent(){
        ResultObject resultObject = ResultObject.successResult();
        List<Content> list = contentService.getContentList();
        resultObject.setData(list);
        return resultObject;
    }
}
