package com.careerDevs;

public class Veggies extends Product{

    boolean isInSeason;
    String color;
    boolean isOrganic;
     public Veggies(String type, String name, double pricePerPound, boolean isInStock, boolean isInSeason,
                    String color, boolean isOrganic) {

         super(type, name, pricePerPound, isInStock);
         this.isInSeason = isInSeason;
         this.color = color;
         this.isOrganic = isOrganic;
     }
}
