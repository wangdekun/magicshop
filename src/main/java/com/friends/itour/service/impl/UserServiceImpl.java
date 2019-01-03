package com.friends.itour.service.impl;

import com.friends.itour.core.ret.ServiceException;
import com.friends.itour.core.universal.AbstractService;
import com.friends.itour.dao.UserMapper;
import com.friends.itour.model.Teacher;
import com.friends.itour.model.User;
import com.friends.itour.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component
@Service
public class UserServiceImpl extends AbstractService<Teacher> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<Teacher> findUser() {
        return userMapper.selectAll();
    }

    /*@Override
    public User findUserByUsernameAndPassword(String userName) {
        User user = userMapper.selectByNameAndPassWord(userName);
        if(user == null){
            throw new ServiceException("暂无该用户");
        }
        return user;
    }

    @Override
    public PageInfo<User> findAllUser(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<User> user = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(user);
        return pageInfo;
    }*/
}
