package com.friends.itour.service;

import com.friends.itour.core.universal.Service;
import com.friends.itour.model.User;

import java.util.List;

public interface UserService extends Service<User> {
    User findUserByUsernameAndPassword(String userName);
    List<User> findAllUser();
}
