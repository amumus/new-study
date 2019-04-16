package com.money.newstudy.service;

import com.money.newstudy.dto.CommentDto;

import java.util.Map;

public interface CommentService {
    Map getCommentListByIdAndType(CommentDto commentDto);

    Map addComment(CommentDto commentDto);

}
