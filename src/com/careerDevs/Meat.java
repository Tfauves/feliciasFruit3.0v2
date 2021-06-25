package com.careerDevs;

public class Meat extends Product{

    public boolean isMarinated;

    public Meat(String type, String name, double pricePerPound, boolean isInStock, boolean isMarinated) {
        super(type, name, pricePerPound, isInStock);
        this.isMarinated = isMarinated;
    }
    public String toString() {

        return String.format("{type: %s, name: %s, pricePerPound: %s, isInStock: %s, isMarinated: %s}",type, name, pricePerPound, isInStock, isMarinated);

    }
}
