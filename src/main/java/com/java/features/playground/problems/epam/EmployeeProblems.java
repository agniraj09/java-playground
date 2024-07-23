package com.java.features.playground.problems.epam;

import java.util.List;
import java.util.stream.Collectors;

/*Given list of employee objects, find out 2nd highest salaried employee. Employees can span across multiple departments. Consider that all employees have unique name */

record Employee(String name, String department, Integer salary) {}

public class EmployeeProblems {

    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("E1", "CC", 10000),
                new Employee("E3", "CC", 20000),
                new Employee("E2", "AC", 30000),
                new Employee("E1", "XC", 40000));

        emps.stream()
                .collect(Collectors.groupingBy(Employee::name, Collectors.summingInt(Employee::salary)))
                .forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
