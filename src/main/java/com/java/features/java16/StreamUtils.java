package com.java.features.java16;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

@Slf4j
public class StreamUtils {
    public static void main(String[] args) {
        dayInPeriod();
        toListUtil();
    }

    private static void toListUtil() {
        log.info(Stream.of("A", "B", "C").toList() + "");
    }

    private static void dayInPeriod() {
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm B");
        log.info(formatter.format(now));
    }
}
