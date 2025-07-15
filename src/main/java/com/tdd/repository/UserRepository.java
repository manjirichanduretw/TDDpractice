package com.tdd.repository;

import com.tdd.model.User;

public interface UserRepository {

    boolean save(User user);
}
