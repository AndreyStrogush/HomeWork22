package com.homeworks.homework22.service;

import com.homeworks.homework22.dto.User;
import com.homeworks.homework22.transformers.UserTransformer;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserTransformer transformer;

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
