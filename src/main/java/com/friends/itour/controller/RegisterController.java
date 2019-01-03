package com.friends.itour.controller;

import com.friends.itour.model.Teacher;
import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/itour")
public class RegisterController {
    User usernew =new User();
    @Resource
    private UserService userService;

    @RequestMapping(value = "/registerone", method = {RequestMethod.GET, RequestMethod.POST})
    public String register() {
        return "loginandregister/register";
    }
    @ResponseBody
    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public String register(@RequestBody User user) {
        if(user!=null){
            System.err.println("user:"+user);
        }
        return "loginandregister/login";
    }

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public List<Teacher> news() {
        System.err.println("00000000000000000000");
        List<Teacher> users = userService.findUser();
        System.err.println(users.get(0).getId());
        return userService.findUser();
    }
}
