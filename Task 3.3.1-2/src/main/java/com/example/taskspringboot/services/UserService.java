package com.example.taskspringboot.services;

import com.example.taskspringboot.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    User delete(int id);
}
