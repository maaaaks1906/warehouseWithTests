package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.domain.model.User;
import com.maks.warehouse.warehouse.domain.service.UserService;

public class RegisterUserUseCase {
    private UserService userService;

    public RegisterUserUseCase(UserService userService) {
        this.userService = userService;
    }

    public void registerNewUser(User user) {
        userService.registerNewUser(user);
    }
}
