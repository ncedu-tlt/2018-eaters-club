package com.netcracker.eaters.service;

import org.springframework.stereotype.Service;

@Service
public interface SecurityService {
    String findloggedInUsername();
    void autoLogin(String email, String password);
}
