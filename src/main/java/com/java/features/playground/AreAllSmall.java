package com.java.features.playground;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AreAllSmall {

    public static void main(String[] args) {
        String s = "cakjcbASUB";

        boolean foundCaps = false;

        for (char c : s.toCharArray()) {
            String character = String.valueOf(c);
            if (!character.equals(character.toLowerCase())) {
                foundCaps = true;
                break;
            }
        }

        if (foundCaps) {
            log.info("String {} contains Uppercase characters", s);
        } else {
            log.info("String {} contains only lower case chars", s);
        }

    }
}
