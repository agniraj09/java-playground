package com.java.features.playground;

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String dough = "";
        private String sauce = "";
        private String topping = "";

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.dough = this.dough;
            pizza.sauce = this.sauce;
            pizza.topping = this.topping;
            return pizza;
        }
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}