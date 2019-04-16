package com.money.newstudy.serviceImpl;

import com.money.newstudy.biz.autoCode.mapper.CommentMapper;
import com.money.newstudy.biz.autoCode.mapper.NewsMapper;
import com.money.newstudy.biz.autoCode.pojo.Comment;
import com.money.newstudy.biz.autoCode.pojo.User;
import com.money.newstudy.biz.mapper.MyCommentMapper;
import com.money.newstudy.biz.mapper.MyNewsMapper;
import com.money.newstudy.biz.mapper.MyUserMapper;
import com.money.newstudy.dto.CommentDto;
import com.money.newstudy.helper.CommentHelper;
import com.money.newstudy.service.CommentService;
import com.money.newstudy.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper commentMapper;
    @Autowired
    MyCommentMapper myCommentMapper;
    @Autowired
    MyUserMapper myUserMapper;
    @Autowired
    MyNewsMapper myNewsMapper;
    @Autowired
    NewsMapper newsMapper;
    CommentHelper helper = new CommentHelper();

    @Override
    public Map getCommentListByIdAndType(CommentDto commentDto) {
        Map result = new HashMap();
//        拿到根评论
        List<Comment> list = myCommentMapper.getCommentListByIdAndType(commentDto);
//        根据root_id，拿到所有子评论
        if(list == null || list.isEmpty()){
            result.put("list",null);
            return result;
        }

//        获取所有user_id
        List<Integer> userIds = new ArrayList<>();
        for(Comment comment : list){
            userIds.add(comment.getUserId());
        }
//        根据根评论跟子评论的user_id来获取用户名
        List<User> userList = myUserMapper.findByIds(userIds);
        Map<Integer,User> userMap = new HashMap();
        for(User user:userList){
            userMap.put(user.getId(),user);
        }
        List<CommentVo> commentVoList = new ArrayList<>();
        for(Comment comment:list){
            CommentVo vo = helper.comment2Vo(comment);
            User u = userMap.get(vo.getUserId());
            vo.setUserName( u.getUsername());
            vo.setUserImage( u.getImage());
            commentVoList.add(vo);
        }
        result.put("list",commentVoList);
        return result;
    }

    @Override
    public Map addComment(CommentDto commentDto){
        commentDto.setCreated(new Date());
        Map map = new HashMap();
        Integer result = commentMapper.insert(commentDto);
        if(result == 1){
            map.put("success",true);
            map.put("message","插入成功");
        }else{
            map.put("success",false);
            map.put("message","插入失败");
        }
        return map;
    }
}
