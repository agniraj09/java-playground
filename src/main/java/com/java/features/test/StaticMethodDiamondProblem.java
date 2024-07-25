package com.java.features.test;

interface Runnable {
    static void behavior() {
        System.out.println("Runnable behavior");
    }
}

interface Swimmable {
    static void behavior() {
        System.out.println("Swimmable behavior");
    }
}

class Run {
    static void behavior() {
        System.out.println("Run");
    }
}

public class StaticMethodDiamondProblem extends Run implements Runnable, Swimmable {
    public static void main(String[] args) {
        var a = new StaticMethodDiamondProblem();
        Runnable.behavior();
        Swimmable.behavior();
        StaticMethodDiamondProblem.behavior();
    }
}
