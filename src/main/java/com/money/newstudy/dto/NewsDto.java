package com.money.newstudy.dto;

import com.money.newstudy.biz.autoCode.pojo.News;

public class NewsDto extends News {
    int pageNum = 10;
    int pageStart = 0;
    String keyword;

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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
