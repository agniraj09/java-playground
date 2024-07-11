package com.java.features.playground.problems.leetcode;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;

class Sample{
    void display(int i){

    }
}

public class Test extends Sample {

    Test(){
        System.out.println("Cons");
    }

    static{
        System.out.println("Stat");
    }

    void display() {

    }

    {
        System.out.println("Block");
    }
    public static void main(String[] args) {
        new Test();
        int i, j;
        i = 100;
        j = 200;

        while(++i > j--);
        System.out.println(i);

        System.out.println(LocalDateTime.now());
    }
}
