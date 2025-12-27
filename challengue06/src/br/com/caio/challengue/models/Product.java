package br.com.caio.challengue.models;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private int quantity;
    ArrayList<Product> products;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}
