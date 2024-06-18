package com.java.features.java12;

import java.time.DayOfWeek;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwitchExpression {
    public static void main(String[] args) {
        oldSwitchExpression(DayOfWeek.FRIDAY);
        newSwitchExpression(DayOfWeek.FRIDAY);
        switchExpressionWithYield(DayOfWeek.FRIDAY);
        switchExpressionWithYield(DayOfWeek.MONDAY);
        switchExpressionWithPatternMatching();
    }

    private static void switchExpressionWithPatternMatching() {
        var explanation =
                """

                static record Human (String name, int age, String profession) {}

                public String checkObject(Object obj) {
                    return switch (obj) {
                        case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
                        case Circle c -> "This is a circle";
                        case Shape s -> "It is just a shape";
                        case null -> "It is null";
                        default -> "It is an object";
                    };
                }

                public String checkShape(Shape shape) {
                    return switch (shape) {
                        case Triangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
                        case Circle c && (c.getNumberOfSides() != 0) -> "This is a weird circle";
                        default -> "Just a normal shape";
                    };
                }
                """;
    }

    private static String oldSwitchExpression(DayOfWeek dayOfWeek) {
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }
        log.info(typeOfDay);
        return typeOfDay;
    }

    private static String newSwitchExpression(DayOfWeek dayOfWeek) {
        String typeOfDay = "";
        typeOfDay =
                switch (dayOfWeek) {
                    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
                    case SATURDAY, SUNDAY -> "Day Off";
                };
        log.info(typeOfDay);
        return typeOfDay;
    }

    private static String switchExpressionWithYield(DayOfWeek dayOfWeek) {
        String typeOfDay = "";
        typeOfDay =
                switch (dayOfWeek) {
                    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                        if (dayOfWeek == DayOfWeek.FRIDAY) {
                            yield "Special day";
                        }
                        yield "Working Day";
                        // Alternate
                        // yield (dayOfWeek == DayOfWeek.FRIDAY) ? "Special day" : "Working Day";
                    }
                    case SATURDAY, SUNDAY -> "Day Off";
                };
        log.info(typeOfDay);
        return typeOfDay;
    }
}
