package com.friends.itour.controller;

import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


@Controller
public class HelloController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello, Spring Boot!";
    }

    @GetMapping(value = "/test")
    public User test(@RequestParam String userName, String passWord) {
        User user = userService.findUserByUsernameAndPassword(userName);
        System.err.println(user.getPassWord());
        if(user.getPassWord().equals(passWord)){
            System.err.println("==================================");
            System.err.println(user);
            return user;
            //return RetResponse.makeOKRsp(user);
            //return  user;
        }else {
            return  null;
        }
        //return  null;
    }

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public String tests() {
        return  "login";
    }

    @RequestMapping(value = "/testlogin", method = RequestMethod.POST)
    public String testlogin(@RequestParam String userName, String passWord) {
        System.err.println(userName);
        System.err.println("============================");
        System.err.println(passWord);
        User user = userService.findUserByUsernameAndPassword(userName);
        System.err.println(user.getPassWord());
        if(user.getPassWord().equals(passWord)){
            System.err.println("==================================");
            System.err.println(user);
            return "index";
            //return RetResponse.makeOKRsp(user);
            //return  user;
        }else {
            return  null;
        }
        //return  null;
       /*if(userName.equals("1")&&passWord.equals("123")){
           return "index";
       }else{
           System.err.println(("000000000000000000"));
           System.err.println((userName));
           return  null;
       }*/
    }
}
