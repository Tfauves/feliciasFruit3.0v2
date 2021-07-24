package com.careerDevs;

import java.util.ArrayList;
import java.util.List;


public class ProduceStand {
//    public Product product;
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
}
