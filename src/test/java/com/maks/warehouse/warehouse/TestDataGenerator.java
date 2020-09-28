package com.maks.warehouse.warehouse;

import com.maks.warehouse.warehouse.domain.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDataGenerator {

    private TestDataGenerator() {}

    public static List<User> getUsers() {
        return new ArrayList<>(Arrays.asList(
                new User(),
                new User(),
                new User()
        ));
    }
}
