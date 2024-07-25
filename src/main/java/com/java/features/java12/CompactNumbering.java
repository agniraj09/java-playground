package com.java.features.java12;

import java.text.NumberFormat;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompactNumbering {
    public static void main(String[] args) {
        NumberFormat shortFormat =
                NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        shortFormat.setMaximumFractionDigits(2);
        int likes = 3555555;
        log.info(shortFormat.format(likes)); // 3.56M

        NumberFormat longFormat =
                NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        log.info(longFormat.format(likes)); // 4 million
    }
}
