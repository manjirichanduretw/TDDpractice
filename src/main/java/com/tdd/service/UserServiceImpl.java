package com.tdd.service;

import com.tdd.model.User;

import java.util.UUID;

public class UserServiceImpl implements UserService{

    public User createUser(String firstName, String lastName,
                           String email,
                           String password, String repeate_Password){
        if(firstName.isEmpty() || lastName.isEmpty() ||
            email.isEmpty() || password.isEmpty() || repeate_Password.isEmpty())
            throw new IllegalArgumentException("User fields can't be empty");

        if(firstName == null || firstName.isBlank())
            throw  new IllegalArgumentException("firstName can't be empty");
        return new User(firstName, lastName, email, UUID.randomUUID().toString());
    }
}
