package com.friends.itour.service;

import com.friends.itour.core.universal.Service;
import com.friends.itour.model.User;

public interface ShopUserService extends Service<User> {
    public  User addUser(User user);
    public  User login(User user);
}
