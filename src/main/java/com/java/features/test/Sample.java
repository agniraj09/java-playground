package com.java.features.test;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample {

    void add(int a) throws IndexOutOfBoundsException, NullPointerException {}

    public static void main(String[] args) {
        List<String> words = List.of("epam", "peam", "end", "ned");

        /*for(int i=0;i<words.size()-1;i++){
            for(int j=i+1;j<words.size();j++){
               var one = Stream.of(words.get(i).split("")).sorted().collect(Collectors.joining());
                var two = Stream.of(words.get(j).split("")).sorted().collect(Collectors.joining());

                if(one.equalsIgnoreCase(two)){
                    System.out.println(words.get(i) + " - " + words.get(j));
                }
            }
        }*/

        IntStream.range(0, 5).forEach(System.out::println);

        IntStream.range(0, words.size() - 1)
                .forEach(i -> IntStream.range(i + 1, words.size()).forEach(j -> {
                    var one = Stream.of(words.get(i).split("")).sorted().collect(Collectors.joining());
                    var two = Stream.of(words.get(j).split("")).sorted().collect(Collectors.joining());
                    if (one.equalsIgnoreCase(two)) {
                        System.out.println(words.get(i) + " - " + words.get(j));
                    }
                }));
    }

    public static void mainaa(String[] args) {
        String word = "absid";

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.abs(Long.valueOf(-2147483648)));
        Long.valueOf(123);
        System.out.println(Objects.equals(
                Long.valueOf(313),
                Long.valueOf(new StringBuilder(String.valueOf(Math.abs(313)))
                        .reverse()
                        .toString())));
    }

    public static void maina(String[] args) {
        Integer a = Integer.parseInt("1000");
        Integer b = Integer.parseInt("1000");

        System.out.println(List.of(1, 2, 3).subList(0, 3));

        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        for (int i = 0; i < k; i++) {
            int n = nums[0];
            int j = 0;
            for (j = 0; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[j] = n;
        }

        System.out.println(nums);

        System.out.println(a == b);
    }
}

class Child extends Sample {
    @Override
    void add(int a) throws ArrayIndexOutOfBoundsException {}
}
