package com.java.features.java9.collectionutils;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CollectionUtils {

    public static void main(String[] args) {
        mapOfMethod();
    }

    private static void mapOfMethod() {
        log.info("{}", Map.of("India", "+91", "US", "+1"));
    }
}
