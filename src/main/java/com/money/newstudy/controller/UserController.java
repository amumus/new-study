package com.money.newstudy.controller;

import com.money.newstudy.biz.autoCode.pojo.User;
import com.money.newstudy.common.ResultObject;
import com.money.newstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("mui/user/login")
    @ResponseBody
    public ResultObject loginu(User user){
        User u = userService.login(user);
        if(u == null){
            return ResultObject.failResult();
        }else{
            return ResultObject.successResult(u);
        }
    }

}
