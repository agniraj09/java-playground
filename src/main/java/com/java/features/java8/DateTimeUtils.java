package com.java.features.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateTimeUtils {

    public static void main(String[] args) {
        dateFormat();
        elapsedTime();
    }

    /** Date Time Parsing in Java 8 using LocalDate */
    private static void dateFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = "12/31/2023";
        var parsedDate = LocalDate.parse(date, formatter);
        log.info("Input date {} has been parsed to {}", date, parsedDate);
        // Input date 12/31/2023 has been parsed to 2023-12-31
        log.info("Parsed date {} has been formatted back to {}", parsedDate, formatter.format(parsedDate));
        // Parsed date 2023-12-31 has been formatted back to 12/31/2023
    }

    /** Calculate time elapsed in a method/task */
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
