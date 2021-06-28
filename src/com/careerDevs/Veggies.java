package com.careerDevs;

public class Veggies extends Product{

    boolean isInSeason;
    String color;
     public Veggies(String type, String name, double pricePerPound, boolean isInStock, boolean isInSeason, String color) {

         super(type, name, pricePerPound, isInStock);
         this.isInSeason = isInSeason;
         this.color = color;
     }
}
