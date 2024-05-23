package com.java.features.java8;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Slf4j
public class DateTimeUtils {

    public static void main(String[] args) {
        dateFormat();
        elapsedTime();
    }

    /**
     * Date Time Parsing in Java 8 using LocalDate
     */
    private static void dateFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = "12/31/2023";
        var parsedDate = LocalDate.parse(date, formatter);
        log.info("Input date {} has been parsed to {}", date, parsedDate);
        log.info("Parsed date {} has been formatted back to {}", parsedDate, formatter.format(parsedDate));
    }

    /**
     * Calculate time elapsed in a method/task
     */
    private static void elapsedTime() {
        long startTime = System.currentTimeMillis();
        log.info("Start time {}", startTime);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        log.info("End time {}", endTime);
        log.info("Elapsed Time -> {} seconds", (endTime - startTime) / 1000);
    }


}
