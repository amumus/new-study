package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.mapper.AdviceMapper;
import com.money.newstudy.biz.autoCode.pojo.Advice;
import com.money.newstudy.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;

public class AdviceServiceImpl implements AdviceService {

    @Autowired
    AdviceMapper adviceMapper;

    @Override
    public int addAdvice(Advice advice) {
        return adviceMapper.insert(advice);
    }
}
