package com.java.features.playground.features.design_patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderPatternCheck {
    public static void main(String[] args) {
        Pizza pizza =
                Pizza.builder().dough("Thick").sauce("Tomato").topping("Cheese").build();
        log.info(pizza.getDough());
    }
}
