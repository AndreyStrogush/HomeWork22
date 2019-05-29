package com.homeworks.homework22.service;

import com.homeworks.homework22.dto.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findUserById(Long id);

    List<User> findAll();
}
