package com.maks.warehouse.warehouse.domain.service;


import com.maks.warehouse.warehouse.domain.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    boolean verifyCredentials(User user);

    void registerNewUser(User user);
}
