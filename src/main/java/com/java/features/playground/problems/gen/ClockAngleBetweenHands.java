package com.java.features.playground.problems.gen;

import java.util.Scanner;

public class ClockAngleBetweenHands {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hour");
        int hour = scan.nextInt();

        System.out.println("Enter minute");
        int minute = scan.nextInt();

        double hourAngle = (hour * 30) + (minute * 0.5);
        double minuteAngle = (minute * 6);

        double angleBetweenHands = Math.abs(hourAngle - minuteAngle);
        System.out.printf("Angle between hands as per logic %s \n", angleBetweenHands);
        double shortestAngle = Math.min(360 - angleBetweenHands, angleBetweenHands);
        System.out.printf("Shortest Angle between hands as per logic %s", shortestAngle);
    }
}
