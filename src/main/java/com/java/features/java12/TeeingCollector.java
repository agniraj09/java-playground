package com.java.features.java12;

import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeeingCollector {
    public static void main(String[] args) {
        var fares = List.of(34, 6346, 747, 45745, 7457, 45545);

        var averageFare =
                fares.stream()
                        .collect(
                                Collectors.teeing(
                                        Collectors.summingInt(i -> i),
                                        Collectors.counting(),
                                        (sum, count) -> sum / count));

        log.info("\nFares -> {} \nAverage Fare -> {}", fares, averageFare);
    }
}
