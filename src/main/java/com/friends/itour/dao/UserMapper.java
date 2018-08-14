package com.friends.itour.dao;

import com.friends.itour.core.universal.Mapper;
import com.friends.itour.model.User;

import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:54
 */
public interface UserMapper extends Mapper<User>{
    User selectByNameAndPassWord(String userName);
    List<User> selectAll();
}
