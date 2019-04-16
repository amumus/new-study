package com.money.newstudy.biz.mapper;


import com.money.newstudy.biz.autoCode.pojo.Comment;
import com.money.newstudy.dto.CommentDto;
import com.money.newstudy.vo.CommentVo;

import java.util.List;

public interface MyCommentMapper {
    List<Comment> getCommentListByIdAndType(CommentDto commentDto);
//    List<Comment> getMyCommentList(CommentDto commentDto);
//
//    Integer getMyCommentListCount(CommentDto commentDto);
//
//    List<CommentVo> selectByRootId(Integer id);
}
