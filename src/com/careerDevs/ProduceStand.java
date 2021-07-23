package com.careerDevs;

import java.util.ArrayList;
import java.util.List;

public class ProduceStand {
    public List<Product> myProduceList = new ArrayList<>();



    public void addFruitToInventory(Fruit fruit) {
        myProduceList.add(fruit);
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
