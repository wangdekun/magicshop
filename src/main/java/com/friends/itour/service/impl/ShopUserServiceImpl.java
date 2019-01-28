package com.friends.itour.service.impl;

import com.friends.itour.dao.ShopUserMapper;
import com.friends.itour.model.User;
import com.friends.itour.service.ShopUserService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service
public class ShopUserServiceImpl implements ShopUserService {
    @Resource
    private ShopUserMapper shopUserMapper;
    @Override
    public User addUser(User user) {
        shopUserMapper.insert(user);
         return user;
    }

    @Override
    public User login(User user) {
            return shopUserMapper.selectToLogin(user.getUserCode(),user.getUserMobile(),user.getUserPassword());


    }

    @Override
    public Integer insert(User model) {
        return null;
    }

    @Override
    public Integer deleteById(String id) {
        return null;
    }

    @Override
    public Integer deleteByIds(String ids) {
        return null;
    }

    @Override
    public Integer update(User model) {
        return null;
    }

    @Override
    public User selectById(String id) {
        return null;
    }

    @Override
    public User selectBy(String fieldName, Object value) throws TooManyResultsException {
        return null;
    }

    @Override
    public List<User> selectListBy(String fieldName, Object value) {
        return null;
    }

    @Override
    public List<User> selectListByIds(String ids) {
        return null;
    }

    @Override
    public List<User> selectByCondition(Condition condition) {
        return null;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public List<User> select(User record) {
        return null;
    }

    @Override
    public User selectOne(User record) {
        return null;
    }
}
