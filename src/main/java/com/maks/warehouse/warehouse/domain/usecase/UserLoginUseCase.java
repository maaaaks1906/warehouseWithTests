package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.domain.model.User;
import com.maks.warehouse.warehouse.domain.service.UserService;

public class UserLoginUseCase {

    private UserService userService;

    public UserLoginUseCase(UserService userService) {
        this.userService = userService;
    }

    public boolean invoke(User user) {
        return userService.verifyCredentials(user);
    }
}
