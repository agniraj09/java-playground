package com.java.features.playground;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AllUniqueCheck {
    public static void main(String[] args) {
        String s = "bvsdii";

        char[] arr = s.toCharArray();

        boolean isUnique = true;
        for (char c : arr) {
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if (firstIndex != lastIndex) {
                isUnique = false;
                break;
            }
        }
        log.info("Is string unique {}", isUnique);
    }
}
