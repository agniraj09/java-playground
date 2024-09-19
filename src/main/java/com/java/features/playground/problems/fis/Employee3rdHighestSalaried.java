package com.java.features.playground.problems.fis;

import java.util.Comparator;
import java.util.List;

public class Employee3rdHighestSalaried {

    public static void main(String[] args) {

        // Add employees
        List<Employee> employees = List.of(
                new Employee("Person1", 10000),
                new Employee("Person2", 47000),
                new Employee("Person3", 45000),
                new Employee("Person4", 26000),
                new Employee("Person5", 67000),
                new Employee("Person6", 53000));

        // var employee =
        // employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).toList().get(2);

        List<Integer> sortedSalary = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .map(Employee::getSalary)
                .distinct()
                .toList();

        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(emp -> System.out.println(emp.getName()));

        employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow();
        // .toList();

        Integer thirdHigh = sortedSalary.get(2);

        var employee = employees.stream()
                .filter(e -> thirdHigh.equals(e.getSalary()))
                .findFirst()
                .get();

        System.out.println(employee.getName() + "-" + employee.getSalary());
    }
}
