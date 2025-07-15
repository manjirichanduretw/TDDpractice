package com.tdd.service;

import com.tdd.model.User;

public interface EmailVerificationService {

     void scheduleEmailConfirmation(User user);
}
