package com.friends.itour.controller;

import com.friends.itour.model.User;
import com.friends.itour.service.RedisService;
import com.friends.itour.service.UserService;
import com.friends.itour.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class RegisterController {
    User usernew =new User();
    @Resource
    private UserService userService;
    @Resource
    private RedisService redisService;

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected  JdbcTemplate jdbcTemplate2;



    @RequestMapping(value = "/xinjianwenjian", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<User> xinjianwenjian(){
        return userService.xinjianwenjian();
    }

    @RequestMapping(value = "/shangchuan", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<User> shangchaun(){
        return userService.shangchuan();
    }
    @RequestMapping(value = "/shanchu", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<User> shanchu(){
        return userService.shanchu();
    }
    @RequestMapping(value = "/xiazai", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<User> xiazai(){
        return userService.xiazai();
    }
    @RequestMapping(value = "/chongmingming", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<User> chongmingming(){
        return userService.chongmingming();
    }

    //注册用户
   /* @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public User news(@RequestBody User users) {
        User user = new User();
        String pd="wswdk123";
        //user.setUserId(3);
        user.setUserCode(2);
        users.setUserCreationDate(new Date());
        //return users;
        //md5加密
        users.setEncryptedUserPassword(Md5.jiami(users.getEncryptedUserPassword()));
        userService.addUser(users);
        return users;
    }*/


    @RequestMapping(value = "/redisTest")
    @ResponseBody
    public String redisTest(){
        String s = redisService.get("1");
        boolean ss = redisService.set("wangdekun1","321321");
        //redisService.
        System.out.println(ss);
        return s;
    }

    @RequestMapping(value = "/redisTest2")
    @ResponseBody
    public String redisTest2(){
        User user = new User();
        user.setUserCode(111);
        user.setUserAddress("上海徐汇1111");


        return redisService.set("yyy",user);
    }

    @RequestMapping(value = "/redisGetObject")
    @ResponseBody
    public User redisGetObject(){

       User user = (User)redisService.get("yyy",true);

       return user;

    }

    @RequestMapping(value = "/redissortAdd")
    @ResponseBody
    public void redisSortAdd1(){

        redisService.sortAdd();
    }



    @RequestMapping(value = "/testjdbcTemplate")
    @ResponseBody
    public void redisSortAdd(){

        // 往第一个数据源中插入两条数据
        jdbcTemplate1.update("insert into user(id) values(?)", 100);
        jdbcTemplate1.update("insert into user(id) values(?)", 101);

        // 往第二个数据源中插入一条数据，若插入的是第一个数据源，则会主键冲突报错
        jdbcTemplate2.update("insert into tb_test(id,create_time,bills) values(?, ?, ?)", 31000, DateUtils.getDate(), 222);

    /*// 查一下第一个数据源中是否有两条数据，验证插入是否成功
    Assert.assertEquals("2", jdbcTemplate1.queryForObject("select count(1) from user", String.class));

    // 查一下第一个数据源中是否有两条数据，验证插入是否成功
    Assert.assertEquals("1", jdbcTemplate2.queryForObject("select count(1) from user", String.class));
*/


    }










}
