package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.domain.model.User;
import com.maks.warehouse.warehouse.domain.service.UserService;

import java.util.List;


public class GetUsersUseCase {

    private UserService userService;

    public GetUsersUseCase(UserService userService) {
        this.userService = userService;
    }

    public List<User> invoke() {
        return userService.getUsers();
    }

}
