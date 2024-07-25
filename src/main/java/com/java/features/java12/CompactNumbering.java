package com.java.features.java12;

import java.text.NumberFormat;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompactNumbering {
    public static void main(String[] args) {
        // Create a NumberFormat instance for short style
         NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        // Set maximum fraction digits to 2
         shortFormat.setMaximumFractionDigits(2);
        // Example number to format
         int likes = 3598;
        // Log the short format of the number
         log.info(shortFormat.format(likes)); // 3.56M
        // Create a NumberFormat instance for long style
         NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        // Log the long format of the number
         log.info(longFormat.format(likes)); // 4 million
    }
}
