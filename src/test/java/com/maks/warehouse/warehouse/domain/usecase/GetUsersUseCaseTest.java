package com.maks.warehouse.warehouse.domain.usecase;

import com.maks.warehouse.warehouse.TestDataGenerator;
import com.maks.warehouse.warehouse.domain.model.User;
import com.maks.warehouse.warehouse.domain.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class GetUsersUseCaseTest {

    @Test
    public void getUsersUseCaseShouldReturnListOfUsers() {
        //Given
        UserService userService = mock(UserService.class);
        GetUsersUseCase getUsersUseCase = new GetUsersUseCase(userService);

        //When
        List<User> users = TestDataGenerator.getUsers();
        when(userService.getUsers()).thenReturn(users);

        //Then
        Assertions.assertEquals(users, getUsersUseCase.invoke());
        verify(userService, times(1)).getUsers();
    }

}
