package com.careerDevs;
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
        // write your code here
        List<Product> myProduce = new ArrayList<>();

        myProduce.add(new Fruit("fruit", "apple", 0.59, true, "red"));
        myProduce.add(new Fruit("fruit", "lemons", 0.38, false, "yellow"));
        myProduce.add(new Fruit("fruit", "orange", 0.89, true, "orange"));
        myProduce.add(new Fruit("fruit", "peach", 0.83, true, "peach"));
        myProduce.add(new Meat("meat", "steak tips", 8.49, true, true));
        myProduce.add(new Meat("meat", "chicken wings", 3.65, false, false));
        myProduce.add(new Meat("meat", "ground beef", 4.49, true, false));
        myProduce.add(new Meat("meat", "beef jerky", 0.89, true, true));
        myProduce.add(new Candy("candy", "runts", 0.20, true, true, true));
        myProduce.add(new Candy("candy", "gummy worms", 0.49, true, true, false));
        myProduce.add(new Veggies("veggies", "peppers", 0.49, true, false, "green", true));
        myProduce.add(new Veggies("veggies", "carrots", 1.49, true, true, "orange", false));


//        displayProducts(myProduce);
//        displayProductByType(myProduce, "candy");
        //System.out.println( displayProductByIndex(myProduce, 3));




    }

    public static void displayProducts(List<Product> productList) {

        for (Product product : productList) {

            System.out.println(product);
        }
    }

    public static void displayProductByType(List<Product> productList, String type) {

        for (Product product : productList) {
            if (product.type.equals(type)) {
                System.out.println(product);
            }
        }
    }

    public static String displayProductByIndex(List<Product> productList, int i) {
        return String.valueOf(productList.get(i).name);
    }

    public static void sellProduct(Scanner type) {

        System.out.println(("Enter Product Type: "));
        Scanner userOrder = new Scanner(System.in);
        type = userOrder;
        System.out.println(type);




    }

}
