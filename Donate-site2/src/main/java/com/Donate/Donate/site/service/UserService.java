package com.Donate.Donate.site.service;

import com.Donate.Donate.site.domain.User;

public interface UserService {
    void save(User user);
    void login(String username, String password);
    User findByUsername(String username);
    User findByEmail(String email);
    User findById(long id);
}
