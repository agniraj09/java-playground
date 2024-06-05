package com.java.features.playground;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindAllSubstrings {
    public static void main(String[] args) {
        String s = "abcd";

        // Approach 1
        for (int count = 1; count <= s.length(); count++) {
            for (int i = 0; i <= (s.length() - count); i++) {
                log.info(s.substring(i, i + count));
            }
        }

        int j = 0;
        // Approach 2
        for (int i = 0; i < s.length(); i++) {
            for (j = i + 1; j <= s.length(); j++) {
                log.info(s.substring(i, j));
                //log.info("{}", j);
            }
            //log.info("{}", j);
        }
    }
}
