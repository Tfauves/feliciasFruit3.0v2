package com.careerDevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ProduceStand {
    public Scanner scanner = new Scanner(System.in);
    public String productName;
    public float amountInPounds;
    public List<Product> myProduceList = new ArrayList<>();
    public List<Product> currentWeeksProducts = new ArrayList<>();

    public void currentWeeksProduce(Product product) {
        currentWeeksProducts.add(product);
    }

    public void addProductToInventory(List<Product> productList) {
        myProduceList.addAll(productList);
    }

    public void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void displayProductByType(List<Product> productList, String type) {
        for (Product product : productList) {
            if (product.type.equals(type)) {
                System.out.println(product);
            }
        }
    }

    public String displayProductByIndex(List<Product> productList, int i) {
        return String.valueOf(productList.get(i).name);
    }

    public void sellProduct(String type, String name, double qty) {
            //inventory--;
            for (int i = 0; i < myProduceList.size(); i++) {
                double saleTotal = myProduceList.get(i).pricePerPound * qty;
                if (myProduceList.get(i).name.equals(name)) {
                    System.out.println("");
                    System.out.println(saleTotal);

                }
            }
    }

    public void checkOut() {
        System.out.println("Enter product: ");


    }
}
