package com.java.features.playground.problems.raja;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AreAllSmall {

    public static void main(String[] args) {
        String s = "cakjcbASUB";

        boolean foundCaps = false;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
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
