package com.java.features.java15;

public class FormattedString {

    public static void main(String[] args) {
        System.out.println("Before Java 15");
        String formattedString = String.format("Hello %s", "java");

        System.out.println(formattedString); // Hello java

        System.out.println("From Java 15");

        String formatted = "Hello %s".formatted("java");
        System.out.println(formatted); // Hello java
    }
}
