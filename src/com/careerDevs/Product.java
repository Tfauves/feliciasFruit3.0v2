package com.careerDevs;
//create class
public class Product {
    public String type;
    public String name;
    public double pricePerPound;
    public boolean isInStock;

    //create constructor.
    public Product(String type, String name, double pricePerPound, boolean isInStock) {

        this.type = type;
        this.name = name;
        this.pricePerPound = pricePerPound;
        this.isInStock = isInStock;
    }


}
