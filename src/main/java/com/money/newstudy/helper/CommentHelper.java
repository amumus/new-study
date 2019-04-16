package com.money.newstudy.helper;


import com.money.newstudy.biz.autoCode.pojo.Comment;
import com.money.newstudy.vo.CommentVo;

public class CommentHelper {
    public CommentVo comment2Vo(Comment comment){
        CommentVo vo = new CommentVo();
        vo.setCommentContent(comment.getCommentContent());
//        vo.setPublishDate(DateUtil.stringtodate(comment.getCreated()));
        vo.setCreated(comment.getCreated());
        vo.setId(comment.getId());
        vo.setParentId(comment.getParentId());
        vo.setRootId(comment.getRootId());
        vo.setTargetId(comment.getTargetId());
        vo.setType(comment.getType());
        vo.setUserId(comment.getUserId());
        vo.setParentUserId(comment.getParentUserId());
        return  vo;
    }
}
