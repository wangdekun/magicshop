package com.friends.itour.service;

import com.friends.itour.core.universal.Service;
import com.friends.itour.model.Teacher;
import com.friends.itour.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService extends Service<Teacher> {
//    User findUserByUsernameAndPassword(String userName);
//    PageInfo<User> findAllUser(Integer page, Integer size);
    List<Teacher> findUser();
}
