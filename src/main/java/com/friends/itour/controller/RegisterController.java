package com.friends.itour.controller;

import com.friends.itour.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/itour")
public class RegisterController {
    User usernew =new User();

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
}
