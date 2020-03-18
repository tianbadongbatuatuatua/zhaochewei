package com.ping.jink.Controller;


import com.ping.jink.bean.Result;
import com.ping.jink.bean.User;
import com.ping.jink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     */
    @PostMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }

    /**
     * 登录
     */
    @PostMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }
}

