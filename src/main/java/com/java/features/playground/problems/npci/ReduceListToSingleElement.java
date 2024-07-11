package com.java.features.playground.problems.npci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReduceListToSingleElement {

    static boolean foundMin = false;
    static boolean foundMax = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number as comma separated");
        String numberString = scan.nextLine();
        List<Integer> numbers = new ArrayList<>(
                Arrays.stream(numberString.split(",")).map(Integer::valueOf).toList());
        double cost = calculateCost(numbers);
        System.out.println("Cost -> " + cost);
    }

    private static double calculateCostOwn(List<Integer> numbers) {
        Double cost = 0D;

        do {
            Integer maxNumber = numbers.stream().max(Integer::compare).get();
            Integer minNumber = numbers.stream().min(Integer::compare).get();

            int sum = maxNumber + minNumber;

            cost = cost + Math.ceil(Double.valueOf(sum) / Double.valueOf(maxNumber - minNumber + 1));

            foundMin = false;
            foundMax = false;
            numbers.removeIf(element -> {
                if (foundMin && foundMax) {
                    return false;
                }

                if (element.equals(maxNumber)) {
                    foundMax = true;
                    return true;
                }
                if (element.equals(minNumber)) {
                    foundMin = true;
                    return true;
                }
                return false;
            });

            numbers.add(sum);
        } while (numbers.size() > 1);

        return cost;
    }

    private static double calculateCost(List<Integer> numbers) {
        Double cost = 0D;
        Integer maxNumber, minNumber;
        int sum;

        while (numbers.size() > 1) {
            maxNumber = numbers.stream().max(Integer::compare).orElse(null);
            minNumber = numbers.stream().min(Integer::compare).orElse(null);

            if (maxNumber != null && minNumber != null) {
                sum = maxNumber + minNumber;
                cost += Math.ceil((double) sum / (maxNumber - minNumber + 1));
                numbers.remove(maxNumber);
                numbers.remove(minNumber);
                numbers.add(sum);
            }
        }

        return cost;
    }
}
