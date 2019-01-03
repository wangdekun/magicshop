package com.friends.itour.dao;

import com.friends.itour.core.universal.Mapper;
import com.friends.itour.model.Teacher;
import com.friends.itour.model.User;

import java.util.List;

/**
 * @author wdk
 * @Description:
 * @time 2018/4/18 11:54
 */
public interface UserMapper extends Mapper<Teacher>{
    //User selectByNameAndPassWord(String userName);
    List<Teacher> selectAll();
}
