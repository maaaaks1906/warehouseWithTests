package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.domain.model.User;
import com.maks.warehouse.warehouse.domain.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class UserLoginUseCaseTest {

    @Test
    public void userLoginUseCaseShouldReturnTrueIfCredentialsExists() {
        UserService userService = mock(UserService.class);
        UserLoginUseCase userLoginUseCase = new UserLoginUseCase(userService);

        User user = new User();
        when(userService.verifyCredentials(user)).thenReturn(true);

        Assertions.assertTrue(userLoginUseCase.invoke(user));
        verify(userService, times(1)).verifyCredentials(user);
    }
}
