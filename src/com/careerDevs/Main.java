package com.careerDevs;
import java.util.*;
//Felicia's fruit stand has upgraded. She now serves fruits and meat now.
//
//
//        Objects
//        1. Create a Product class this should contain data that any item she sells will have
//        2. Create a Fruit class that inherits from the Product class that contain fruit specific data.
//        3. Create a Meat class that inherits from the product class that contains Meat specific data.
//        Be creative with your classes.
//
//
//        Code
//        1. In the main class create a Product list
//2. add to the list three different Meats and 3 different Fruits.
//        3. in the main class create a method called displayProducts it should accept a Product list and display all the items in the list.
//        4. Create a second displayProducts method in the main class that accepts a Product list AND a string 'type' if the type is meat only print the meat products and if fruit only display the fruit products
//        a. extra challenge try using a switch statement for this instead of if else
//        5. create a displayProduct method that accepts a product list and an int i. print out the product at index i.
//
//
//        be aware that except for the switch statement you should have all the code you need in Thursday's walkthrough. You'll need to adjust some items and use them in different ways to fit this exercise however there are new new concepts in this challenge. Try this by yourself first and see how far you get, You may work with a classmate starting on Tuesday. Of course if you get completely stuck you can ask for help in slack.
import java.util.*;
public class Main {

    public static void main(String[] args) {

      ProduceStand feliciasStand01 = new ProduceStand();

        feliciasStand01.currentWeeksProduce(new Fruit("fruit", "apple", 1.05, true, "red"));
        feliciasStand01.currentWeeksProduce(new Fruit("fruit", "pear", 1.39, true, "green"));
        feliciasStand01.currentWeeksProduce(new Meat("meat", "steak tips", 3.49, true, true));
        feliciasStand01.currentWeeksProduce(new Candy("candy", "runts", 1.59, true, true, false));
        feliciasStand01.addProductToInventory(feliciasStand01.currentWeeksProducts);

        feliciasStand01.displayProducts(feliciasStand01.myProduceList);

    }

}
