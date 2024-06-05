package com.java.features.java9.collectionutils;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

@Slf4j
public class CollectionUtils {

    public static void main(String[] args) {
        mapOfMethod();
    }

    private static void mapOfMethod() {
        log.info("{}", Map.of("India", "+91", "US", "+1"));
    }
}
