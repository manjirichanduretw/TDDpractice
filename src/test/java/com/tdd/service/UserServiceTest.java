package com.tdd.service;

import com.tdd.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {

    @Test
    void testCreateUser_WhenUserDetailsProvided_ReturnUserObject(){
//            Arrange
        UserService userService = new UserServiceImpl();
//        Act
        User user = userService.createUser();
//        Assert
        assertNotNull(user, "User should not be null");

    }
}
