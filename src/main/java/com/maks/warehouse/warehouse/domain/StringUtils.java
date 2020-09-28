package com.maks.warehouse.warehouse.domain;

public class StringUtils {

    private StringUtils() {}

    public static String removeSpaces(String s) {
        return s.replace(" ", "");
    }
}
