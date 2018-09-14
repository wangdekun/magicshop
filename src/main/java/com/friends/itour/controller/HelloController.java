package com.friends.itour.controller;


import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/user")
public class HelloController {
    @Resource
    private UserService userService;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public String register() {
        return "loginandregister/register";
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String say() {
        return "Hello, Spring Boot!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestParam String userName, String passWord, HashMap<String, Object> map) {
        User user = userService.findUserByUsernameAndPassword(userName);
        System.err.println(user.getPassWord());
        if (user.getPassWord().equals(passWord)) {
            System.err.println("==================================000000000000");
            System.err.println(user);
            httpSession.setAttribute("user", user);
            map.put("user", user);
            //model.addAttribute("user", user);
            return "index";
            //return RetResponse.makeOKRsp(user);
            //return  user;
        } else {
            //model.addAttribute("error", "用户名或密码错误，请重新登录！");
            return "login";
        }
        //return  null;
    }

    @RequestMapping(value = "/tests", method = RequestMethod.GET)
    public String tests() {
        return "login";
    }

    @RequestMapping(value = "/testlogin", method = RequestMethod.POST)
    public String testlogin(@RequestParam String userName, String passWord, Model model) {
        System.err.println(userName);
        System.err.println("============================");
        System.err.println(passWord);
        User user = userService.findUserByUsernameAndPassword(userName);
        System.err.println(user.getPassWord());
        if (user.getPassWord().equals(passWord)) {
            System.err.println("==================================000000000000");
            System.err.println(user);
            httpSession.setAttribute("user", user);
            model.addAttribute("user", user);
            return "index";
            //return RetResponse.makeOKRsp(user);
            //return  user;
        } else {
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
//        List<User> user = userService.findAllUser();
//        model.addAttribute("user", user);
//        model.addAttribute("message","This is your message");
        return "test";

    }

    @ApiOperation(value = "查询用户", notes = "分页查询用户所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页码",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示条数",
                    dataType = "Integer", paramType = "query")
    })
    @RequestMapping(value = "/showusetableqq", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<User> shows(@RequestParam(defaultValue = "0") Integer page,
                                @RequestParam(defaultValue = "0") Integer size) {
        //try {
        PageInfo<User> pageInfo = userService.findAllUser(page, size);
        //map.put("user", user);
        //JSONArray js = JSONArray.fromObject(user);
        //model.addAttribute("user", js.toString());
//            resp.setCharacterEncoding("utf-8");
//            PrintWriter respWriter = resp.getWriter();
//            System.err.println(user);
//            System.err.println("======================");
//            System.err.println(js);
//            Map<String, Object> ss = new HashMap<String, Object>();
//            ss.put("sss", user);
        //respWriter.append(user);
        //model.addAttribute("user", user);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        return pageInfo;

    }

    @ApiOperation(value = "查询用户", notes = "分页查询用户所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页码",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示条数",
                    dataType = "Integer", paramType = "query")
    })
    @RequestMapping(value = "/testtt", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<User> showstt(@RequestParam(defaultValue = "0") Integer page,
                                  @RequestParam(defaultValue = "0") Integer size) {
        //try {
        PageInfo<User> pageInfo = userService.findAllUser(page, size);
        //map.put("user", user);
        //JSONArray js = JSONArray.fromObject(user);
        //model.addAttribute("user", js.toString());
//            resp.setCharacterEncoding("utf-8");
//            PrintWriter respWriter = resp.getWriter();
//            System.err.println(user);
//            System.err.println("======================");
//            System.err.println(js);
//            Map<String, Object> ss = new HashMap<String, Object>();
//            ss.put("sss", user);
        //respWriter.append(user);
        //model.addAttribute("user", user);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        return pageInfo;
    }
}
