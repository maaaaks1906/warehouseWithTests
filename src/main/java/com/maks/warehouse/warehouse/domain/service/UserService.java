package com.maks.warehouse.warehouse.domain.service;


import com.maks.warehouse.warehouse.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUser(String username);

    List<User> getUsers();

    boolean verifyCredentials(User user);

    void registerNewUser(User user);
}
