package com.friends.itour.controller;


import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


@Controller
public class HelloController {
    @Resource
    private UserService userService;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET,RequestMethod.POST})
    public String say() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping(value = "/test" , method = RequestMethod.POST)
    public String test(@RequestParam String userName, String passWord, HashMap<String, Object> map) {
        User user = userService.findUserByUsernameAndPassword(userName);
        System.err.println(user.getPassWord());
        if(user.getPassWord().equals(passWord)){
            System.err.println("==================================000000000000");
            System.err.println(user);
            httpSession.setAttribute("user", user);
            map.put("user", user);
            //model.addAttribute("user", user);
            return "index";
            //return RetResponse.makeOKRsp(user);
            //return  user;
        }else {
            //model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "login";
        }
        //return  null;
    }

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public String tests() {
        return  "login";
    }

    @RequestMapping(value = "/testlogin", method = RequestMethod.POST)
    public String testlogin(@RequestParam String userName, String passWord, Model model) {
        System.err.println(userName);
        System.err.println("============================");
        System.err.println(passWord);
        User user = userService.findUserByUsernameAndPassword(userName);
        System.err.println(user.getPassWord());
        if(user.getPassWord().equals(passWord)){
            System.err.println("==================================000000000000");
            System.err.println(user);
            httpSession.setAttribute("user", user);
            model.addAttribute("user", user);
            return "index";
            //return RetResponse.makeOKRsp(user);
            //return  user;
        }else {
            model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "login";
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


    @RequestMapping(value = "/showusetable" , method = RequestMethod.GET)
    public String show(@RequestParam HashMap<String, Object> map ,Model model) {
        List<User> user = userService.findAllUser();
        model.addAttribute("user", user);
        model.addAttribute("message","This is your message");
        return "usertable";

    }

    @RequestMapping(value = "/showusetableqq" , method = RequestMethod.POST)
    public void shows(@RequestParam(required = false)  Model model) {
        List<User> user = userService.findAllUser();
        //map.put("user", user);
        JSONArray js = JSONArray.fromObject(user);
        model.addAttribute("user", js.toString());


    }
}
