package com.java.features.playground.collections;

import java.util.ArrayList;
import java.util.List;

public class CustomListTester {

    public static void main(String[] args) {
        List<String> customList = new CustomList<>();
        System.out.println(customList.add("Agni"));
        System.out.println(customList.add("Agni"));
        System.out.println(customList.add("Raj"));


        List<String> listWithDuplicates = List.of("Raj", "Guna", "Agni");
        System.out.println(customList.addAll(listWithDuplicates));

        System.out.println(customList);
    }
}
