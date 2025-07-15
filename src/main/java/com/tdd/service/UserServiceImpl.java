package com.tdd.service;

import com.tdd.model.User;

import java.util.UUID;

public class UserServiceImpl implements UserService{

    public User createUser(String firstName, String lastName,
                           String email,
                           String password, String repeate_Password){
        return new User(firstName, lastName, email, UUID.randomUUID().toString());
    }
}
