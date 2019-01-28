package com.friends.itour.controller;

import com.friends.itour.model.User;
import com.friends.itour.service.ShopUserService;
import com.friends.itour.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webshop")
public class UserController {
    @Autowired
    private ShopUserService shopUserService;
    //注册用户
    @RequestMapping(value = "/register.json", method = {RequestMethod.GET, RequestMethod.POST})
    public User register(@RequestBody User user) {
        user.setUserHeadPortrait("123456");
        user.setUserCode(123475);
        user.setUserPassword(Md5.jiami(user.getUserPassword()));
        shopUserService.addUser(user);
        return user;
    }


    //用户登录
    @RequestMapping(value = "/login.json", method = {RequestMethod.GET, RequestMethod.POST})
    public User login(@RequestBody User user) {
        user.setUserPassword(Md5.jiami(user.getUserPassword()));
        return shopUserService.login(user);
    }
}
