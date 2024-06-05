package com.java.features.java12;

import lombok.extern.slf4j.Slf4j;

import java.text.NumberFormat;
import java.util.Locale;

@Slf4j
public class CompactNumbering {
    public static void main(String[] args) {
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        shortFormat.setMaximumFractionDigits(2);
        int likes = 3598;
        log.info(shortFormat.format(likes));

        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        log.info(longFormat.format(likes));
    }

}
