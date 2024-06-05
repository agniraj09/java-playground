package com.java.features.playground;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Getter
@Setter
@Slf4j
class Developer extends Employee {
   private String name;
   private int id;

    public Developer(){
    }
    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public float getSalary() {
        return 222;
    }

    public static void main(String[] args) {
        Developer d1 = new Developer("Agni", 549806);
        Developer d2 = new Developer("Raj", 806547);

       // Comparable<Developer> comparable = (devIn) -> Integer.compare(this.id, devIn.getId());
        Comparator<Developer> c = (dev1, dev2) -> Integer.compare(dev1.getId(), dev2.getId())  ;

        Stream.of(d1, d2).sorted(c).forEach(dev -> log.info("{}", dev.getName()));
    }

/*    private void compare(){
        Developer d1 = new Developer("Agni", 549806);
        Developer d2 = new Developer("Raj", 806547);

        Comparable<Developer> comparable = (devIn) -> Integer.compare(this.id, devIn.getId());
        Comparator<Developer> c = (dev1, dev2) -> Integer.compare(dev1.getId(), dev2.getId())  ;

        Stream.of(d1, d2).sorted(c).forEach(dev -> log.info("{}", dev.getName()));
    }*/
}