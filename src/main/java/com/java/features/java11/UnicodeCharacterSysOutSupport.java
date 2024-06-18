package com.java.features.java11;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnicodeCharacterSysOutSupport {

    public static void main(String[] args) {
        String codepoint = "U+1F92A"; // crazy face
        log.info(String.valueOf(convertCodePoints(codepoint)));
    }

    private static char[] convertCodePoints(String codepoint) {
        Integer i = Integer.valueOf(codepoint.substring(2), 16);
        return Character.toChars(i);
    }
}
