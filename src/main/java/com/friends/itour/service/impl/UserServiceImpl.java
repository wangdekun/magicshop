package com.friends.itour.service.impl;

import com.friends.itour.core.ret.ServiceException;
import com.friends.itour.core.universal.AbstractService;
import com.friends.itour.dao.UserMapper;
import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findUserByUsernameAndPassword(String userName) {
        User user = userMapper.selectByNameAndPassWord(userName);
        if(user == null){
            throw new ServiceException("暂无该用户");
        }
        return user;
    }

    @Override
    public User findAllUser() {
        return null;
    }
}
