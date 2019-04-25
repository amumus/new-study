package com.money.newstudy.dto;

import com.money.newstudy.biz.autoCode.pojo.Favorites;

public class FavoritesDto extends Favorites {
    String keyword;
    int pageNum = 10;
    int pageStart = 0;

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
