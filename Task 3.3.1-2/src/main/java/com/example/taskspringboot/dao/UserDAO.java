package com.example.taskspringboot.dao;

import com.example.taskspringboot.models.User;

import java.util.List;

public interface UserDAO {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}