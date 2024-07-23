package com.java.features.playground.problems.fis;

public class Employee {

    private String name;
    private Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalary() {
        return this.salary;
    }
}
