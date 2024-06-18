package com.java.features.java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StreamUtils {
    public static void main(String[] args) {
        toListUtil();
        dayInPeriod();
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
