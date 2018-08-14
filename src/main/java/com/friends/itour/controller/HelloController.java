package com.friends.itour.controller;

import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@Controller
public class HelloController {
   /* @Autowired
    private UserService userService;*/
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return  "welcome";
    }

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public String tests() {
        return  "login";
    }

    @RequestMapping(value = "/testlogin", method = RequestMethod.POST)
    public String testlogin(@RequestParam String userName, String passWord) {
       /* User user = userService.findUserByUsernameAndPassword(userName);
        if(user.getPassWord() == passWord){
            System.err.println("==================================");
            System.err.println(user);
            return "index";
            //return RetResponse.makeOKRsp(user);
            //return  user;
        }else {
            return  null;
        }*/
       if(userName.equals("1")&&passWord.equals("123")){
           return "index";
       }else{
           System.err.println(("000000000000000000"));
           System.err.println((userName));
           return  null;
       }
    }
}
