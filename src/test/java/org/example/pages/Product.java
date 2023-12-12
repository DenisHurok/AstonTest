package org.example.pages;

import java.util.List;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int getTotalPrice(List<Product> products) {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "{" +
                "name= " + name +
                ", price=" + price +
                "}\n";
    }

}