package com.kun.server.dao.mapper;

import com.kun.server.dao.model.User;

public interface UserMapper {
    public User queryUser(User user);
    public void createUser(User user);
}
