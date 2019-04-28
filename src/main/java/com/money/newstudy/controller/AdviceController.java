package com.money.newstudy.controller;

import com.money.newstudy.biz.autoCode.pojo.Advice;
import com.money.newstudy.common.ResultObject;
import com.money.newstudy.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdviceController {

    @Autowired
    AdviceService adviceService;

    @RequestMapping("/mui/advice/addAd")
    @ResponseBody
    public ResultObject addAdvice(Advice advice){
        ResultObject resultObject = ResultObject.successResult();
        int result = adviceService.addAdvice(advice);
        return null;
    }
}
