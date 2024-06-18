package com.java.features.playground.problems.raja;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "Angela";
        String s2 = "Anglea";

        if (s1.length() != s2.length()) {
            log.info("Not anagram");
        }
        char[] s1list = s1.toCharArray();
        char[] s2list = s2.toCharArray();

        Arrays.sort(s1list);
        Arrays.sort(s2list);

        boolean isAnagram = true;
        for (int i = 0; i < s1list.length; i++) {
            if (s1list[i] != s2list[i]) {
                isAnagram = false;
                break;
            }
        }

        log.info("Are both anagram {}", isAnagram);
    }
}
