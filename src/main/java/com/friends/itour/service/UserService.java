package com.friends.itour.service;

import com.friends.itour.core.universal.Service;
import com.friends.itour.model.User;

public interface UserService extends Service<User> {
    User findUserByUsernameAndPassword(String userName);
    User findAllUser();
}
