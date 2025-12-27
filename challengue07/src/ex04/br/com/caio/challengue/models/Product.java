package ex04.br.com.caio.challengue.models;

import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    ArrayList<Product> products;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double sumPrice () {
        return this.price++;
    }

    public void averagePrice () {

    }
}
