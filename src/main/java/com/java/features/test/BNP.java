package com.java.features.test;

import java.util.Comparator;
import java.util.List;

record Employee(String name, int salary) {}

public class BNP {

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("D", 10000), new Employee("A", 1000), new Employee("B", 10000));

        System.out.println("Comparator using custom implementation");
        employees.stream()
                .sorted((e1, e2) -> {
                    int result = e2.salary() - e1.salary();
                    if (result == 0) {
                        result = e1.name().compareTo(e2.name());
                    }
                    return result;
                })
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("Comparator using Comparator in-built methods");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::salary).reversed().thenComparing(Employee::name))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
