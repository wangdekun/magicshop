package com.friends.itour.dao;

import com.friends.itour.core.universal.Mapper;
import com.friends.itour.model.User;
import org.apache.ibatis.annotations.Param;

public interface ShopUserMapper extends Mapper<User> {
    public void addUser(User user);
    public User selectToLogin(@Param("userCode")Integer userCode,@Param("userMobile")Integer userMobile,@Param("userPassword")String userPassword);
}
