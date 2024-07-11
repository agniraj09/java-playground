package com.java.features.java16;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PatternMatching {
    public static void main(String[] args) {
        List<Object> objList = new ArrayList<>();
        objList.add("This is a String");
        objList.add(Integer.valueOf(10));

        // Previous implementation using regular instance of
        objList.forEach(obj -> {
            if (obj instanceof String) {
                String stringObj = (String) obj;
                log.info(stringObj.toUpperCase());
            }
        });

        // New implementation using pattern matching instance of
        objList.forEach(obj -> {
            if (obj instanceof String stringObj) {
                log.info(stringObj.toUpperCase());
            }
        });
    }
}
