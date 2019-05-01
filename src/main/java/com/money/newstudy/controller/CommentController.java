package com.money.newstudy.controller;

import com.money.newstudy.common.ResultObject;
import com.money.newstudy.common.ResultStatus;
import com.money.newstudy.dto.CommentDto;
import com.money.newstudy.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/mui/comment/getCommentListByIdAndType")
    @ResponseBody
    public ResultObject getCommentListByIDAndType(CommentDto commentDto){
        commentDto.setPageStart(commentDto.getPageNum() * commentDto.getPageStart());
        ResultObject resultObject = ResultObject.successResult();
        Map map = commentService.getCommentListByIdAndType(commentDto);
        resultObject.setData(map);
        return resultObject;
    }

    @RequestMapping("/mui/comment/addComment")
    @ResponseBody
    public ResultObject addComment(CommentDto commentDto){
        commentDto.setCreated(new Date());
        ResultObject resultObject = ResultObject.successResult();
//        try {
            Map map = commentService.addComment(commentDto);
            resultObject.setData(map);
            if(!(boolean)map.get("success")){
                resultObject.setStatus(ResultStatus.FAIL);
            }
            resultObject.setMessage((String) map.get("message"));
//        } catch (Exception e) {
//            resultObject = ResultObject.failResult();
//            resultObject.setMessage("服务器出错");
//        }

        return resultObject;
    }
}


