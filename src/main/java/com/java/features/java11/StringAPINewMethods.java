package com.java.features.java11;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringAPINewMethods {
    public static void main(String[] args) {
        isBlank();
        repeat();
        lines();
        trimVsStrip();
    }

    private static void isBlank() {
        log.info("Agniraj isBlank ? - {}, \"\" isBlank ? - {}", "Agniraj".isBlank(), "".isBlank());
    }

    private static void repeat() {
        log.info("Ha ".repeat(3));
    }

    private static void lines() {
        String multilineStr = "This is\n \n a multiline\r string.";

        var lines = multilineStr.lines().filter(line -> !line.isBlank()).toList();
        log.info("Splitted lines {}", lines);
    }

    private static void trimVsStrip() {
        String nameWithASCIISpaceInFrontAndUnicodeSpaceAtEnd = "\t Rajan\u2001\u2003";

        log.info(
                "Is Rajan and trimmed() Rajan same ? {} ",
                "Rajan".equalsIgnoreCase(nameWithASCIISpaceInFrontAndUnicodeSpaceAtEnd.trim())
                        + "");
        log.info(
                "Is Rajan and stripped() Rajan same ? {} ",
                "Rajan".equalsIgnoreCase(nameWithASCIISpaceInFrontAndUnicodeSpaceAtEnd.strip())
                        + "");
    }
}
