package com.money.newstudy.vo;

import com.money.newstudy.biz.autoCode.pojo.News;

public class NewsVo extends News {
    int likeNum = 0;

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
