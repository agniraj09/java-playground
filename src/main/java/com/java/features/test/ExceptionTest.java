package com.java.features.test;

class MyRunExc extends RuntimeException {
    public MyRunExc(String message) {
        super(message);
    }
}

class MyCheckExc extends Exception {
    public MyCheckExc(String message) {
        super(message);
    }
}

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("");

        try {
            throw new MyCheckExc("");
        } catch (MyCheckExc e) {
            // throw new RuntimeException(e);
        }

        throw new MyRunExc("");
    }
}
