package com.money.newstudy.dto;

import com.money.newstudy.biz.autoCode.pojo.Mylike;
import com.money.newstudy.biz.autoCode.pojo.News;

public class MylikeDto extends Mylike {
    News news;
    int pageNum = 10;
    int pageStart = 0;

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageStart() {
        return pageStart;
    }

    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }
}
