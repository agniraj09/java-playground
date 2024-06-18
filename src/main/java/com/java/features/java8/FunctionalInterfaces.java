package com.java.features.java8;

import java.util.List;
import java.util.Random;
import java.util.function.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionalInterfaces {

    public static void main(String[] args) {
        unaryOperator();
        binaryOperator();
        function();
        biFunction();
        predicate();
        biPredicate();
        consumer();
        supplier();
    }

    /**
     * Unary operator takes 1 argument and returns a result in same data type of the argument. Input
     * - 1 argument Returns - 1 result Data type - Same for both
     */
    private static void unaryOperator() {
        log.info("***   unaryOperator demo    ***");
        // sample 1
        UnaryOperator<String> unaryOperatorString =
                name -> "Hello " + name + ", Welcome to Java tutorials!";
        log.info("unaryOperatorString -> {}", unaryOperatorString.apply("Agni"));

        // sample 2
        UnaryOperator<Integer> unaryOperatorIntSquare = value -> value * value;
        var value = 567;
        log.info(
                "unaryOperatorIntSquare -> Square of {} is {}",
                value,
                unaryOperatorIntSquare.apply(value));

        log.info("***   unaryOperator demo    ***\n");
    }

    /**
     * Binary operator takes 2 arguments of the same type and returns a result in same data type of
     * arguments. Input - 2 arguments Returns - 1 result Data type - Same for all
     */
    private static void binaryOperator() {
        log.info("***   binaryOperator demo    ***");
        // sample 1
        BinaryOperator<String> binaryOperatorString = (name, city) -> name + " is from " + city;
        log.info(
                "binaryOperatorString example -> {}",
                binaryOperatorString.apply("Agni", "Chennai"));
        // sample 2
        double stockUnits = 45;
        double stockPrice = 567.89;
        BinaryOperator<Double> binaryOperatorStockValue = (units, price) -> units * price;
        log.info(
                "binaryOperatorStockValue -> Your portfolio value is {}",
                binaryOperatorStockValue.apply(stockUnits, stockPrice));

        log.info("***   binaryOperator demo    ***\n");
    }

    /**
     * Function takes 1 argument and returns a result. Data type of input and output can be
     * different Input - 1 argument Returns - 1 result Data type - Can be different
     */
    private static void function() {
        log.info("***   function demo    ***");
        // sample 1
        Function<Integer, String> functionOddOrEven = value -> value % 2 == 0 ? "even" : "odd";
        var number = 10;
        log.info("functionOddOrEven -> {} is {} number", number, functionOddOrEven.apply(number));

        // sample 2
        Function<Integer, String> luckyOrUnlucky =
                chosenNumber ->
                        ((chosenNumber == new Random().nextInt(2, 5))
                                ? "You are lucky today!"
                                : "You are unlucky today!");
        log.info("luckyOrUnlucky -> {}", luckyOrUnlucky.apply(5));

        log.info("***   function demo    ***\n");
    }

    /**
     * BiFunction takes 2 arguments and returns a result. Data type of input and output can be
     * different Input - 2 arguments Returns - 1 result Data type - Can be different
     */
    private static void biFunction() {
        log.info("***   biFunction demo    ***");
        // sample 1
        int stockUnits = 45;
        double stockPrice = 567.89;
        BiFunction<Integer, Double, String> biFunctionStockValue =
                (units, price) -> ("Your portfolio value is " + (units * price));
        log.info("biFunctionStockValue -> {}", biFunctionStockValue.apply(stockUnits, stockPrice));

        log.info("***   biFunction demo    ***\n");
    }

    /**
     * Predicate takes 1 argument and returns boolean result. Input - 1 argument Returns - boolean
     * Data type - Can be different
     */
    private static void predicate() {
        log.info("***   predicate demo    ***");
        // sample 1
        Predicate<Integer> votingEligibilityValidation = age -> (age >= 18);
        var age = 20;
        log.info(
                "votingEligibilityValidation Predicate in action. Input {} is eligible for voting - {}",
                age,
                votingEligibilityValidation.test(age));

        log.info("***   predicate demo    ***\n");
    }

    /**
     * BiPredicate takes 2 arguments and returns boolean result. Input - 2 arguments Returns -
     * boolean Data type - Can be different
     */
    private static void biPredicate() {
        log.info("***   biPredicate demo    ***");
        // sample 1
        BiPredicate<Integer, Double> eligibleForTaxConcession =
                (age, income) -> (age >= 60 && income < 10000);
        var age = 50;
        var income = 200000D;
        log.info(
                "eligibleForTaxConcession BiPredicate in action. Input {} is eligible for tax concession - {}",
                age,
                eligibleForTaxConcession.test(age, income));

        log.info("***   biPredicate demo    ***\n");
    }

    /** Consumer takes 1 argument and returns no result. Input - 1 argument Returns - void */
    private static void consumer() {
        log.info("***   consumer demo    ***");
        // sample 1
        Consumer<Integer> votingEligibilityValidation =
                age -> {
                    if (age >= 18) log.info("Age {}. Eligible for voting", age);
                    else log.info("Age {}. Not eligible for voting", age);
                };

        var age = 20;
        log.info("votingEligibilityValidation consumer in action.");
        votingEligibilityValidation.accept(age);

        log.info("***   consumer demo    ***\n");
    }

    /**
     * Supplier takes no argument but returns a result. Input - no input Returns - 1 result Data
     * type - anything
     */
    private static void supplier() {
        log.info("***   supplier demo    ***");
        // sample 1
        Supplier<List<String>> daysSupplier =
                () ->
                        List.of(
                                "Sunday",
                                "Monday",
                                "Tuesday",
                                "Wednesday",
                                "Thursday",
                                "Friday",
                                "Saturday");
        log.info("supplier -> {}", daysSupplier.get());

        log.info("***   supplier demo    ***\n");
    }
}
