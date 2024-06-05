package com.java.features.java11;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class StringTestCase {
    public static void main(String[] args) {
        String s = "\t abc\u2001";

        log.info("abc".equalsIgnoreCase(s.trim()) + "");
        log.info("abc".equalsIgnoreCase(s.strip()) + "");

        Character c = '\u2020';
        String s1 = c + "abc" + c;

        log.info(Character.isWhitespace(c) + "");

        log.info(s1.equalsIgnoreCase(s1.trim()) + "");
        log.info("abc".equalsIgnoreCase(s1.strip()) + "");

        List.of("A", "B").toArray();
    }
}