package com.test.demo.utils;

public class CommonUtil {
    public static String camelCaseToSnakeCase(String camel) {
        return camel.replaceAll("([A-Z])", "_$1").toLowerCase();
    }

}
