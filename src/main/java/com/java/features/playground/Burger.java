package com.java.features.playground;

public class Burger {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    public Burger dough(String dough) {
        this.dough = dough;
        return this;
    }

    public Burger sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public Burger topping(String topping) {
        this.topping = topping;
        return this;
    }
}