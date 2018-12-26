package com.friends.itour.dao;

import com.friends.itour.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Register {
     User user =new User();

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public String register() {
        return "loginandregister/login";
    }
}
