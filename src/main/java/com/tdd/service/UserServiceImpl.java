package com.tdd.service;

import com.tdd.model.User;

public class UserServiceImpl implements UserService{

    public User createUser(){
        return new User();
    }
}
