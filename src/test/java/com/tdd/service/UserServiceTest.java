package com.tdd.service;

import com.tdd.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    UserService userService;
    String firstName;
    String lastName;
    String email;
    String password;
    String repeate_Password;

    @BeforeEach
    void init(){
        userService = new UserServiceImpl();
        firstName = "Manjiri";
        lastName = "Chandure";
        email = "chanduremanjiri@gmail.com";
        password = "12345668";
        repeate_Password = "12345668";
    }

    @Test
    @DisplayName("User Object Created")
    void testCreateUser_WhenUserDetailsProvided_ReturnUserObject(){

//        Act
        User user = userService.createUser(firstName, lastName, email, password, repeate_Password);
//        Assert
        assertNotNull(user, "User should not be null");
        assertEquals(firstName, user.getFirstName(), "firstName does not get set!");
        assertEquals(lastName, user.getLastName(), "lastName does not get set");
        assertEquals(email, user.getEmail(), "email does not get set");
        assertNotNull(user.getId(), "UserId is missing");

    }

    @DisplayName("EmptyFirstName should throws IllegalArgumentException")
    @Test
    void testCreateUser_WhenFirstNameIsEmpty_returnIllegalArgumentException(){
//Arrange
        String firstName = " ";
        String expectedThrownMessage = "firstName can't be empty";
//        Act & Assert
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, ()->{
            User user = userService.createUser(firstName, lastName, email, password, repeate_Password);
        }, "When firstName is empty should return illegalArgumentException");

        assertEquals(expectedThrownMessage, thrown.getMessage(), "exception message should be same");

    }

//    @Test
//    void testCreateUser_whenUserCreated_shouldReturnSameFirstName(){
//
//        UserService userService = new UserServiceImpl();
//        String firstName = "Manjiri";
//        String lastName = "Chandure";
//        String email = "chanduremanjiri@gmail.com";
//        String password = "12345668";
//        String repeate_Password = "12345668";
//
//        User user = userService.createUser(firstName, lastName, email, password, repeate_Password);
//
//        assertEquals(firstName, user.getFirstName(), "firstName does not get set!");
//
//    }
}
