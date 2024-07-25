package com.java.features.playground.problems.whatsapp;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployeesSalarySumWithMultipleEmployeeId {

    record Employee(String name, long empId, double salary) {}

    public static void main(String[] args) {
        var groupedSalary = Stream.of(
                        new Employee("Agni", 111, 100.00),
                        new Employee("Raj", 222, 100.00),
                        new Employee("Agni", 333, 100.00),
                        new Employee("Raj", 444, 100.00),
                        new Employee("Guna", 111, 100.00))
                .collect(Collectors.groupingBy(Employee::name, Collectors.summingDouble(Employee::salary)));

        log.info("{}", groupedSalary);
    }
}
