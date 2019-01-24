package com.friends.itour.service;

import com.friends.itour.core.universal.Service;
import com.friends.itour.model.Teacher;
import com.friends.itour.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService extends Service<User> {
//    User findUserByUsernameAndPassword(String userName);
//    PageInfo<User> findAllUser(Integer page, Integer size);
    //List<User> findUser();
    public  void addUser(User user);
    List<User> shangchuan();
    List<User> shanchu();
    List<User> xiazai();
    List<User> chongmingming();
    List<User> xinjianwenjian();

    List<User> testMybatis();
}
