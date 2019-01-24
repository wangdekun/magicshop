package com.friends.itour.controller;

import com.friends.itour.model.User;
import com.friends.itour.service.ShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/webshop")
public class UserController {
    @Autowired
    private ShopUserService shopUserService;
    //注册用户
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public User news(@RequestBody User user) {
        user.setUserHeadPortrait("123456");
        user.setUserCode(123475);
        shopUserService.addUser(user);
        return user;
    }
}
