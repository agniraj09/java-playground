package com.java.features.playground;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder().dough("Thick").sauce("Tomato").topping("Cheese").build();
        Burger burger = new Burger().dough("dough").sauce("sauce").topping("top");
        log.info(pizza.getDough());
    }
}
