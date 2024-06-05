package com.java.features.java12;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUtils {
    public static void main(String[] args) {
        indentation();
    }

    private static void indentation() {
        String name = "Agni";
        log.info(name);
        log.info(name.indent(5));
    }
}
