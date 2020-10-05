package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.domain.model.User;
import com.maks.warehouse.warehouse.domain.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RegisterUserUseCaseTest {

    @BeforeTestClass
    public void setUp() {
        User user = new User();
    }
    @Test
    void registerUserUseCaseShouldRegisterNewUser(User user) {
        UserService userService = mock(UserService.class);
        RegisterUserUseCase registerUserUseCase = new RegisterUserUseCase(userService);
        // TODO: 28/09/2020 W miare mozliwosci dokonczyc 
    }
}