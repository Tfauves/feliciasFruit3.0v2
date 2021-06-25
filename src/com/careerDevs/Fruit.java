package com.careerDevs;

public class Fruit extends Product {

    public String color;

    public Fruit(String type, String name, double pricePerPound, boolean isInStock, String color) {

        super(type, name, pricePerPound, isInStock);
        this.color = color;
    }
    public String toString() {

        return String.format("{type: %s, name: %s, pricePerPound: %s, isInStock: %s, color: %s}",type, name, pricePerPound, isInStock, color);

    }
}
