package com.tdd.service;

import com.tdd.model.User;

public class UserServiceImpl implements UserService{

    public User createUser(String firstName, String lastName,
                           String email,
                           String password, String repeate_Password){
        return new User(firstName);
    }
}
