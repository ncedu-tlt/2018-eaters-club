package com.netcracker.eaters.service;

import com.netcracker.eaters.model.User;

public interface UserService {
    void save(User user);

    User findByEmail(String email);
}