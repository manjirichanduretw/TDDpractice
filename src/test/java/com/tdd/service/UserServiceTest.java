package com.tdd.service;

import com.tdd.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserServiceTest {

    @Test
    void testCreateUser_WhenUserDetailsProvided_ReturnUserObject(){
//            Arrange
        UserService userService = new UserServiceImpl();
        String firstName = "Manjiri";
        String lastName = "Chandure";
        String email = "chanduremanjiri@gmail.com";
        String password = "12345668";
        String repeate_Password = "12345668";
//        Act
        User user = userService.createUser(firstName, lastName, email, password, repeate_Password);
//        Assert
        assertNotNull(user, "User should not be null");

    }

    @Test
    void testCreateUser_whenUserCreated_shouldReturnSameFirstName(){

        UserService userService = new UserServiceImpl();
        String firstName = "Manjiri";
        String lastName = "Chandure";
        String email = "chanduremanjiri@gmail.com";
        String password = "12345668";
        String repeate_Password = "12345668";

        User user = userService.createUser(firstName, lastName, email, password, repeate_Password);

        assertEquals(firstName, user.getFirstName(), "firstName does not get set!");

    }
}
