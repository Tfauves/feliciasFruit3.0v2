package com.careerDevs;

public class Candy extends Product{

    boolean isSweet;
    boolean isSour;
    public Candy(String type, String name, double pricePerPound, boolean isInStock, boolean isSweet, boolean isSour){

    super(type, name, pricePerPound, isInStock);

    this.isSweet = isSweet;
    this.isSour = isSour;

    }
    public String toString() {

     return String.format("{type: %s, name: %s, pricePerPound: %s, isInStock: %s, isSweet: %s, isSour: %s}",type, name, pricePerPound, isInStock, isSweet, isSour);
    }
}
