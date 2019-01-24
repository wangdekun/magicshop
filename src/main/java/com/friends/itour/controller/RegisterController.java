//package com.friends.itour.controller;
//
//import com.friends.itour.model.User;
//import com.friends.itour.service.RedisService;
//import com.friends.itour.service.UserService;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/test")
//public class RegisterController {
//    User usernew =new User();
//    @Resource
//    private UserService userService;
//    @Resource
//    private RedisService redisService;
//
//    /*@RequestMapping(value = "/registerone", method = {RequestMethod.GET, RequestMethod.POST})
//    public String register() {
//        return "loginandregister/register";
//    }
//    @ResponseBody
//    @RequestMapping(value = "/register", method = {RequestMethod.POST})
//    public String register(@RequestBody User user) {
//        if(user!=null){
//            System.err.println("user:"+user);
//        }
//        return "loginandregister/login";
//    }*/
//    @RequestMapping(value = "/xinjianwenjian", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public List<User> xinjianwenjian(){
//        return userService.xinjianwenjian();
//    }
//
//    @RequestMapping(value = "/shangchuan", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public List<User> shangchaun(){
//        return userService.shangchuan();
//    }
//    @RequestMapping(value = "/shanchu", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public List<User> shanchu(){
//        return userService.shanchu();
//    }
//    @RequestMapping(value = "/xiazai", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public List<User> xiazai(){
//        return userService.xiazai();
//    }
//    @RequestMapping(value = "/chongmingming", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public List<User> chongmingming(){
//        return userService.chongmingming();
//    }
//
//    //注册用户
//    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public User news(@RequestBody User users) {
////        User user = new User();
////        String pd="wswdk123";
////        //user.setUserId(3);
////        user.setUserCode(002);
////        users.setUserCreationDate(new Date());
////        //return users;
////        //md5加密
////        //users.setEncryptedUserPassword(Md5.jiami(users.getEncryptedUserPassword()));
////        userService.addUser(users);
//        return users;
//    }
//    //redis教程https://www.cnblogs.com/springboot/p/8907884.html
//    @RequestMapping(value = "/setRedis", method = {RequestMethod.GET, RequestMethod.POST})
//    public String setRedis(@RequestBody  String name) {
//        return  redisService.get("1");
//    }
//
//
//}
