package com.maks.warehouse.warehouse;

import com.maks.warehouse.warehouse.domain.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void removeSpacesShouldReturnStringWithoutSpaces() {
        //Given
        String s = "Ala ma kota";

        //When
        String result = StringUtils.removeSpaces(s);

        //Then
        assertEquals("Alamakota", result);
    }

}
